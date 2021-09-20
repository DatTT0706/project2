package com.dattran.project2.controller;

import com.dattran.project2.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public String allUsers(ModelMap modelMap) {
        modelMap.addAttribute("userList", userService.findAll());
        return "allUser";
    }
}
