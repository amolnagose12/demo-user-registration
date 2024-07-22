package com.amol.controller;

import com.amol.dto.UserDto;
import com.amol.service.IUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/registrations")
public class UserController {

    @Autowired
    private final IUserService userService;

    @PostMapping("/users")
    public UserDto createUser(@Valid @RequestBody UserDto userDto) {
        return this.userService.createUser(userDto);
    }
}
