package com.mycompany.boot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MyApiController {

    @RequestMapping("/api")
    public String index() {
        return "api success";
    }

}