package com.user.loginsystem.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import com.user.loginsystem.model.User;
import com.user.loginsystem.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;


@Controller
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) { this.userService = userService; }

    @GetMapping("/register")
    public String showRegisterPage(Model model) {

        model.addAttribute("user", new User());

        return "register";
    }

    @PostMapping("/register")
    public String registerUser(
            @Valid @ModelAttribute("user") User user,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "register";
        }
        try {

            userService.registerUser(user);

        } catch (IllegalArgumentException e) {

            bindingResult.rejectValue(
                    "email",
                    "email.exists",
                    e.getMessage()
            );

            return "register";
        }

        return "redirect:/register?success";
    }
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }
}