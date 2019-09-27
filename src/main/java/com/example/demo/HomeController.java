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

    @RequestMapping("/blog1")
    public String Blog1() { return "blog1"; }

    @RequestMapping("/blog2")
    public String Blog2() { return "blog2"; }

    @RequestMapping("/blog3")
    public String Blog3() { return "blog3"; }

    @RequestMapping("/blog4")
    public String Blog4() { return "blog4"; }

    @RequestMapping("/blog5")
    public String Blog5() { return "blog5"; }

    @RequestMapping("/blog6")
    public String Blog6() { return "blog6"; }

    @RequestMapping("/blog7")
    public String Blog7() { return "blog7"; }

    @RequestMapping("/blog8")
    public String Blog8() { return "blog8"; }

    @RequestMapping("/blog9")
    public String Blog9() { return "blog9"; }

    @RequestMapping("/blog10")
    public String Blog10() { return "blog10"; }

    @RequestMapping("/blog11")
    public String Blog11() { return "blog11"; }

    @RequestMapping("/blog12")
    public String Blog12() { return "blog12"; }

}
