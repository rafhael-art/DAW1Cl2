package com.cibertec.cl2.cl2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.cl2.cl2.entity.Estado;
import com.cibertec.cl2.cl2.services.EstadoService;

@RestController
@RequestMapping("/api/estado")
public class EstadoController {
    @Autowired
    private EstadoService  estadoService;
    
     @PostMapping()
    public ResponseEntity<Estado> post(@RequestBody Estado estado){
        return new ResponseEntity<Estado>(estadoService.add(estado), HttpStatus.CREATED);
    }
}
