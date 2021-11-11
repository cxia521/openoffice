package com.chinadci.springboot.conf;

import com.chinadci.springboot.controller.AccountController;
import com.chinadci.springboot.entity.Affixinfo;
import com.chinadci.springboot.entity.AffixinfoExample;
import com.chinadci.springboot.mapper.AffixinfoMapper;
import com.chinadci.springboot.model.sysmodel.ServiceResult;
import com.chinadci.springboot.service.IAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@RefreshScope //动态刷新配置
@Component
@Configuration
@EnableScheduling
public class Scheduler {
    @Autowired
    AccountController accountController;
    @Autowired
    AffixinfoMapper affixinfoMapper;
    @Autowired
    IAccountService iAccountService;
    @Value("${runtimer}")
    private String runtimer;


    @Scheduled(cron = "${timing}")
    @Async//开启异步方法
    public void configureTasks() {
        System.out.println(runtimer);
        System.out.println("任务开始，任务参数:11111");
        if(runtimer.equals("true")){
            AffixinfoExample affixinfoExample=new AffixinfoExample();
            affixinfoExample.or().andOpcountBetween(0,2).andPreviewurlIsNull();
            List<Affixinfo> list = affixinfoMapper.selectByExample(affixinfoExample);
            if (list != null && !"".equals(list)) {
                for (Affixinfo affixinfo : list) {
                    ServiceResult serviceResult = iAccountService.ConvertbyId(affixinfo.getAffixid());
                    if (!"".equals(serviceResult.ReturnCode) && serviceResult.ReturnCode == 7) {
                        System.out.println("任务失败："+affixinfo.getAffixid());
                        affixinfo.setOpcount(affixinfo.getOpcount() + 1 );
                        affixinfoMapper.updateByPrimaryKey(affixinfo);
                    }
                }
            }}
        System.out.println("任务开始，任务参数:11111");
    }
}
