package com.cibertec.cl2.cl2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.cl2.cl2.entity.Documento;
import com.cibertec.cl2.cl2.services.DocumentoService;

@RestController
@RequestMapping("/api/documento")
public class DocumentoController {
    @Autowired
    private DocumentoService  documentoService;

    @PostMapping()
    public ResponseEntity<Documento> post(@RequestBody Documento documento){
        return new ResponseEntity<Documento>(documentoService.ingresarDocumento(documento), HttpStatus.CREATED);
    }
    
}
