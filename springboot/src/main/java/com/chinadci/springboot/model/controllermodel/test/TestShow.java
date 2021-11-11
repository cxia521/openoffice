package com.chinadci.springboot.model.controllermodel.test;

import io.swagger.annotations.ApiParam;
import lombok.Data;

/**
 * @program: springboot
 * @description:
 * @author: keke
 * @create: 2021-04-23 10:07
 **/
@Data
public class TestShow {
    @ApiParam(value = "id", name = "id")
    int id;
    @ApiParam(value = "名称", name = "name")
    String name;
    @ApiParam(value = "不知道", name = "display")
    String display;
}
