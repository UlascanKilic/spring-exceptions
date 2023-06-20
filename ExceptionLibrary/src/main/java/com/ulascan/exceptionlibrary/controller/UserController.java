package com.ulascan.exceptionlibrary.controller;

import com.ulascan.exceptionlibrary.service.IUserService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    @GetMapping
    public void getUser(){
        userService.getUser();
    }

    @GetMapping("/email")
    public void getEmail(){
        userService.getEmail();
    }

    @GetMapping("/generic")
    public void getGenericError(){
        userService.getGenericError();
    }
}
