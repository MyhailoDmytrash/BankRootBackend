package com.lab.application.controllers;

import com.lab.application.models.dtos.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("/user")
public interface UserController
{
    @PostMapping("/registration")
    void registration(@RequestBody UserDTO userDTO);

    @PostMapping("/authentication")
    Map<String, String> authentication(@RequestBody UserDTO userDTO);
}
