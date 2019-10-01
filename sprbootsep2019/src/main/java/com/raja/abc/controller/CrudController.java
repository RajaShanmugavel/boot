package com.raja.abc.controller;

import com.raja.abc.data.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {

    @Autowired
    UserRepo userRepo;

    @RequestMapping("/")
    public String hello() {
        userRepo.findAll().forEach(s->{
            System.out.println(s.getFirstName());
        });
        return "Hello boot";
    }


}
