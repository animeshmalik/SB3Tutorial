package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Value("${welcome.msg}")
    private String msg;
    @GetMapping("/hello")
    public String getMessage(){
    return msg;
    }
}
