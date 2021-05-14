package com.apex.azure.devop.test.devoptest.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiuxian.song
 * @version 1.0
 * @create: 2021-05-13 21:05
 */
@RestController
public class HelloWorld {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getCheckListByHouse(){
        return "Hello, this is Azure Devops test from Apex";
    }
}
