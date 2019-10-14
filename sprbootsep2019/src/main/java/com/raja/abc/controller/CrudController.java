package com.raja.abc.controller;

import com.raja.abc.data.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abc")
public class CrudController {

    @Autowired
    UserRepo userRepo;

    @RequestMapping("/test")
    public String hello() {
        userRepo.findAllUsers().forEach(s->{
            System.out.println(s.getFirstName());
        });
        return "Hello boot";
    }


}
