package com.codepresso.codepressoblog.controller;

import com.codepresso.codepressoblog.controller.dto.UserRequestDto;
import com.codepresso.codepressoblog.service.UserService;
import com.codepresso.codepressoblog.vo.User;
import com.codepresso.codepressoblog.vo.UserSession;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/user/signup")
    public String signup(@RequestBody @Validated UserRequestDto userDto) {
        User user = userDto.getUser();
        userService.signup(user);

        return "Success";
    }

    @PostMapping("/user/login")
    public String login(@RequestBody UserRequestDto userDto, HttpServletResponse response) {
        User user = userDto.getUser();
        User loginResult = userService.login(user);

        if(loginResult.getId() == null) {
            throw new NullPointerException();
        }
        System.out.println("login Success!!");

        Boolean sessionResult = userService.createSession(loginResult);

        if(sessionResult == false) {
            throw new NullPointerException();
        }
        System.out.println("Session creation Success!!");
        UserSession userSession = userService.createCookie(loginResult);

        String cookie = userSession.getId().toString();
        // 쿠키 생성
        System.out.println(cookie);
        Cookie setCookie = new Cookie("cookie", cookie);
        setCookie.setMaxAge(60*60*24);
        setCookie.setPath("/");
        response.addCookie(setCookie);

        System.out.println("Cookie creation Success!! -> " + setCookie);


        return "Success";
    }

    @GetMapping("/user/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookieList= request.getCookies();
        for(Cookie cookie : cookieList) {
            if(cookie.getName().equals("cookie")) {
                userService.logout(Integer.parseInt(cookie.getValue()));
                break;
            }
        }

        Cookie logout = new Cookie("cookie", null);
        logout.setMaxAge(0);
        response.addCookie(logout);
        System.out.println("hi");
        return "Success";
    }
}
