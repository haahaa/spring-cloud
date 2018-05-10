package com.whzj.boot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: shikang
 * @Description:
 * @Date: Created in 2018/5/10 16:31
 */
@RestController
public class HelloController {

    @PostMapping("hello")
    public String hello() {
        return "hello spring cloud!!!";
    }

}
