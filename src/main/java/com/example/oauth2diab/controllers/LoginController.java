//package com.example.oauth2diab.controllers;
//
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("login/oauth2")
//public class LoginController {
//
//    @PostMapping(path = "/code/{registrationId}")
//    public ResponseEntity<?> authorize(@PathVariable(name = "registrationId") String registrationId){
//        System.out.println("Registration id: " + registrationId);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//}
