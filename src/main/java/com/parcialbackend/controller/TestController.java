package com.parcialbackend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMINISTRADOR')")
    public String adminTest() {
        return "Solo visible para ADMIN";
    }

    @GetMapping("/acomodador")
    @PreAuthorize("hasRole('ACOMODADOR')")
    public String acomodadorTest() {
        return "Solo visible para ACOMODADOR";
    }
}