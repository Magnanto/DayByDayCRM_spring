package com.limulcomp.daybydaycrm_spring.controllers;

import com.limulcomp.daybydaycrm_spring.api.UsersApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UsersApi usersApi;

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String checkLogin(@RequestParam("email") String email, @RequestParam("password") String password) {
        ResponseEntity<String> response = usersApi.login(email, password);
        if (response.getStatusCode().is2xxSuccessful()) {
            return "redirect:/dashboard";
        } else {
            return "redirect:/?error=Invalid email or password";
        }
    }
}
