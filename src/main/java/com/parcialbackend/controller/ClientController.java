package com.parcialbackend.controller;



import com.parcialbackend.repository.VehicleRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ClientController{

    private VehicleRepository vehiculoRepo;

    @GetMapping("/cliente/vehiculos")

    public String verVehiculos(Model model) {
    model.addAttribute("vehiculos", vehiculoRepo.findAll());

    return "cliente/lista-vehiculos";
}
}