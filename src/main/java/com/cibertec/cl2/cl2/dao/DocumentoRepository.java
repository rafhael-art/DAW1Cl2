package com.cibertec.cl2.cl2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.cl2.cl2.entity.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {
    
}
