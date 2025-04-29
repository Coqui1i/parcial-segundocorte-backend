package com.parcialbackend.controller;

import com.parcialbackend.entity.VehicleEntity;
import com.parcialbackend.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AcomodadorController{
    @Autowired
    private VehicleRepository vehicleRepository;

@GetMapping("/acomodador/vehiculos")
public String verVehicles(Model model) {
    model.addAttribute("vehiculos", vehicleRepository.findAll());
    return "acomodador/lista-vehiculos";
}

@PostMapping("/acomodador/vehiculos/actualizar-ubicacion")
public String actualizarUbicacion(@RequestParam String placa, @RequestParam String nuevaUbicacion) {
    VehicleEntity v = vehicleRepository.findById(placa).orElseThrow();
    v.setUbication(nuevaUbicacion);
    vehicleRepository.save(v);
    return "redirect:/acomodador/vehiculos";
}
}