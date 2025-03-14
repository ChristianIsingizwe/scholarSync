package com.CodeCatalyst.ScholarlySync.controllers;

import com.CodeCatalyst.ScholarlySync.models.User;
import com.CodeCatalyst.ScholarlySync.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/api/v1/students")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

}
