package com.perihanozby.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    //    http://localhost:4444/api
    @GetMapping("/api")
    public String getThymeleaf(){
        return "index";

    }
}
