package com.example.dev;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("")
    public String home() {
        return "123";
    }

    @RequestMapping("about")
    public String about() {
        return "345";
    }
}