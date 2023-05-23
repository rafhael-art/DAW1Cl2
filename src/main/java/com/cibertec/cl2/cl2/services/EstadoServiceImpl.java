package com.cibertec.cl2.cl2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.cl2.cl2.dao.EstadoRepository;
import com.cibertec.cl2.cl2.entity.Estado;

@Service
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public Estado add(Estado estado) {
        return estadoRepository.save(estado);
    }
    
}
