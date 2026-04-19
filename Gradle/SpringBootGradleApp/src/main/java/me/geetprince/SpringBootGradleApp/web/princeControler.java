package me.geetprince.SpringBootGradleApp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class princeControler {
    @GetMapping("/")
    public String getInfo(){
        return "My name is prince";
    }
}
