package com.parcialbackend.controller;

import com.parcialbackend.entity.VehicleEntity;
import com.parcialbackend.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class AdminController{

    @Autowired
    @GetMapping("/admin/vehiculos")
public String listarVehiculos(Model model) {
    model.addAttribute("vehiculos", vehicleRepository.findAll());
    return "admin/lista-vehiculos";
}

    @Autowired
    private VehicleRepository vehicleRepository;

    @PostMapping("/admin/vehiculos/registrar")
    public String registrarVehiculo(VehicleEntity v) {
        vehicleRepository.save(v);
        return "redirect:/admin/vehiculos";
    }
}