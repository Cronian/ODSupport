package com.odsupport.api.v1.web;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
