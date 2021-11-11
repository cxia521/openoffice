package com.chinadci.springboot.controller;


import com.chinadci.springboot.model.sysmodel.ServiceObjectResult;
import com.chinadci.springboot.model.sysmodel.ServiceResult;
import com.chinadci.springboot.service.IAccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: keke wei
 * @create: 2020-06-02 11:49
 **/

/**
 * @description: 无需登录访问的后台
 * @author: keke wei
 * @create: 2020-04-27 09:50
 **/
@RestController
@RequestMapping("/account")
@Api(value = "AccountController", tags = {"无需登录模块  登录 验证码等"})
public class AccountController {
    @Autowired
    IAccountService accountService;

    @ApiOperation(value = "根据id转换")
    @GetMapping("/VonvertbyId")
    public ServiceObjectResult ConvertbyId(String id) {
        ServiceObjectResult serviceResult = new ServiceObjectResult();
        serviceResult = accountService.ConvertbyId(id);
        return serviceResult;
    }

    @ApiOperation(value = "批量转换-定时器")
    @GetMapping("/Convert")
    public void Convert(String yuan,String mu,String ip) {
        accountService.Convert(yuan,mu,ip);
    }

    }


