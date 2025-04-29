package com.parcialbackend.controller;

import com.parcialbackend.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleController {
    @Autowired
    private VehicleRepository vehiculoRepo;

    @GetMapping("/admin/vehiculos")
    public String listarVehiculos(Model model) {
        model.addAttribute("vehiculos", vehiculoRepo.findAll());
        return "admin/lista-vehiculos";
    }
}
