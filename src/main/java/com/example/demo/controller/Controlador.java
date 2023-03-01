package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaceService.IPersonaService;
import com.example.demo.model.Persona;

@Controller
@RequestMapping
public class Controlador {
    
    @Autowired
    private IPersonaService service;

    @GetMapping("/personas")
    public String listar(Model model){
        List<Persona> personas = service.listar();
        for (Persona persona : personas)
            System.out.println(persona.getName());
            
        model.addAttribute("personas", personas);
        return "personas";
    }   
}
