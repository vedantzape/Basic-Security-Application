package com.vedant.SecurityApplication.controller;

import com.vedant.SecurityApplication.model.AppUser;
import com.vedant.SecurityApplication.service.AppUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private final AppUserService service;

    public AuthController(AppUserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public ResponseEntity<AppUser> register(@RequestBody AppUser user) {
        return new ResponseEntity<>(service.register(user), HttpStatus.CREATED);
    }
}
