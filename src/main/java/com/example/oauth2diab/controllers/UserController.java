package com.example.oauth2diab.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.HashMap;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("me")
    public ResponseEntity<?> getMe(Principal principal){
        return new ResponseEntity<>(principal ,HttpStatus.OK);
    }
    @GetMapping("you")
    public ResponseEntity<?> getYou(HttpSession httpSession, HttpServletRequest httpServletRequest){
        HashMap<String, Object> map = new HashMap<>();
//        map.put("session",httpServletRequest.getSession());
        map.put("session",httpSession.getId());
        map.put("request",httpServletRequest.getSession().getId());
        return new ResponseEntity<>(map ,HttpStatus.OK);
    }

}
