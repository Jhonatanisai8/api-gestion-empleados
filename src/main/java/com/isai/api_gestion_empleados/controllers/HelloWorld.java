package com.isai.api_gestion_empleados.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("api/v1/saludo")
public class HelloWorld {

    @GetMapping("/hola")
    public String holaMundo(@RequestParam String param) {
        return "Hola Mundo con " + param;
    }

}
