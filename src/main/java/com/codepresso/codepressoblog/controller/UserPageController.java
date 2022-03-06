package com.codepresso.codepressoblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserPageController {

    @RequestMapping("/user/login")
    public String getLoginPage() {
        return "login";
    }

    @RequestMapping("/user/signup")
    public String getSignupPage() {
        return "signup";
    }
}
