package com.praveen.infotec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @RequestMapping("/home")
    public String displayHomePage() {
        return "Hai my first application";
    }

}
