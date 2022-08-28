package com.tcm.controller;

import com.tcm.model.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping(path = "/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("bye")
    @ResponseBody
    public String bye() {
        return "Bye!";
    }

    @GetMapping("/india")
    public ResponseEntity<Country> india() {
        Country india = Country.of("India", 75);
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .header("continent", "Asia")
                .header("Capital", "New Delhi")
                .header("Food", "Vegetarian")
                .body(india);
    }
}
