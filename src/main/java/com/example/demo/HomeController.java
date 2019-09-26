package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String Home() {
        return "home";
    }

    @RequestMapping("/authorProfile")
    public String AuthorProfile() {
        return "authorProfile";
    }

    @RequestMapping("/bootCampDescription")
    public String BootCampDescription() {
        return "bootCampDescription";
    }
}
