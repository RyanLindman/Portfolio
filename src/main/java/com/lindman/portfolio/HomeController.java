package com.lindman.portfolio;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String getHome(){

        return "index";
    }

    @GetMapping("/career")
    public String getProjects(){

        return "career";
    }
    @GetMapping("/contact")
    public String getContact() {

        return "contact";
    }
}


