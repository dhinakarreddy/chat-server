package com.dhinakar.chat.controller;

import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/")
    public String init() {
        return "Welcome";
    }
}
