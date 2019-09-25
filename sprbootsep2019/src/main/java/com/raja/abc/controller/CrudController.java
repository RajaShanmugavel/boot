package com.raja.abc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {

    @RequestMapping("/")
    public String hello() {
        return "Hello boot";
    }
}
