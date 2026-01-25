package com.fyp.Ghumantey.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fyp.Ghumantey.entity.UserDetails;
import com.fyp.Ghumantey.service.UserDetailsService;

@Controller
public class UserController {

    @Autowired
    private UserDetailsService userDetailsService;

    @GetMapping("/user/home")
    public String userHome(Model model, Principal principal) {
        UserDetails userDetails = userDetailsService.getUserByUsername(principal.getName());
        model.addAttribute("user", userDetails);
        return "user/home";
    }
}