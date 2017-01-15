package be.waitinglist.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Named;

@RestController
public class Login {

    public Login() {
    }

    @GetMapping("login")
    public String createLoginForUser(){
        return "test";
    }



}
