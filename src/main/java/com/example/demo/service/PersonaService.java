package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.IPersonaService;
import com.example.demo.interfaces.IPersona;
import com.example.demo.model.Persona;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private IPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarID(int id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public int save(Persona p) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        
    }
    
}
