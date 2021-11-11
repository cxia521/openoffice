package com.chinadci.springboot.service;


 import com.chinadci.springboot.model.sysmodel.ServiceListResult;
 import com.chinadci.springboot.model.sysmodel.ServiceObjectResult;
 import com.chinadci.springboot.model.sysmodel.ServiceResult;

import java.util.HashMap;

/**
 * @description: 无须登录模块的接口
 * @author: keke wei
 * @create: 2020-04-27 10:02
 **/
public interface IAccountService {


    ServiceObjectResult ConvertbyId(String id);

    void  Convert(String yuan,String mu,String ip);
}
