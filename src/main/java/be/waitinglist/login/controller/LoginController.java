package be.waitinglist.login.controller;

import be.waitinglist.common.UncheckedObjectMapper;
import be.waitinglist.login.model.Login;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import javax.inject.Named;

@RestController
public class LoginController {

    private UncheckedObjectMapper objectMapper;

    @Inject
    public LoginController(UncheckedObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping("login")
    public String createLoginForUser(){
        Login login = new Login(Long.parseLong("1"), "Welcome Erlend");
        return objectMapper.writeValueAsString(login);
    }



}
