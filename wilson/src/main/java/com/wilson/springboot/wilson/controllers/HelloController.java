package com.wilson.springboot.wilson.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/saludo")
    public String saludar(){
        return "Hola Mundo!";
    }





}
