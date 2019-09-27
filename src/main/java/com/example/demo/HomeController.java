package com.example.demo;


import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage() {
        return "home";
    }

    @RequestMapping("/home")
    public String index() {
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

    @RequestMapping("/entireBlog")
    public String EntireBlog() { return "entireBlog"; }

    @RequestMapping("/shortBlog")
    public String ShortBlog() { return "shortBlog"; }

}
