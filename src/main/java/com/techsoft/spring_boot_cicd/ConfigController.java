package com.techsoft.spring_boot_cicd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${app.user_name}")
    private String username;

    @Value("${app.password}")
    private String password;

    @GetMapping("/credentials")
    public String getCredentials() {
        return "User: " + username + ", Password: " + password;
    }
}
