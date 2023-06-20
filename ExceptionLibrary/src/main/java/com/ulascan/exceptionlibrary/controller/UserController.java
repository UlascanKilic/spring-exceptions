package com.ulascan.exceptionlibrary.controller;

import com.ulascan.exceptionlibrary.dto.UserDTO;
import com.ulascan.exceptionlibrary.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    @GetMapping
    public UserDTO getUser(){
        return userService.getUser();
    }

    @GetMapping("/controllerError")
    public ResponseEntity<?> throwException() {
        return ResponseEntity
                .ok(userService.throwException());
    }

}
