package com.cibertec.cl2.cl2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.cl2.cl2.dao.DocumentoRepository;
import com.cibertec.cl2.cl2.entity.Documento;

@Service
public class DocumentoServiceImpl implements DocumentoService {

    @Autowired
    private DocumentoRepository documentoRepository;

    @Override
    public Documento ingresarDocumento(Documento documento) {
        return documentoRepository.save(documento);
    }

     
    
}
