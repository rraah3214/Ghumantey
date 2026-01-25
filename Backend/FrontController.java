package com.fyp.Ghumantey.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.fyp.Ghumantey.entity.UserDetails;
import com.fyp.Ghumantey.entity.UserRole;
import com.fyp.Ghumantey.service.UserDetailsService;

@Controller
public class FrontController {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Landing page
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Signup page
    @GetMapping("/signup")
    public String showSignupPage(Model model) {
        model.addAttribute("user", new UserDetails());
        return "signup";
    }

    // Register user
    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") UserDetails userDetails) {
        // Encode password
        userDetails.setPassword(passwordEncoder.encode(userDetails.getPassword()));
        userDetails.setActive("1");

        // Set role
        UserRole userRole = new UserRole();
        userRole.setRole(userDetails.getAuthority() != null ? userDetails.getAuthority() : "ROLE_USER");
        userRole.setUserDetails(userDetails);
        userDetails.setUserRole(userRole);

        userDetailsService.saveUser(userDetails);

        return "redirect:/login?signupSuccess=true";
    }

    // Login page
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    // After login redirect based on role
    @GetMapping("/welcome")
    public String redirectAfterLogin(Authentication authentication, Model model) {
        String username = authentication.getName();
        String role = authentication.getAuthorities().iterator().next().getAuthority();

        model.addAttribute("username", username);
        model.addAttribute("role", role);

        if (role.equals("ROLE_USER")) {
            return "home";
        }
        if (role.equals("ROLE_ADMIN")) {
            return "admin/dashboard";
        }

        return "redirect:/login?error=unauthorized";
    }
}