package com.cibertec.cl2.cl2.entity;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Date fechaRecepcion;
    private String detallePedido;

    @ManyToMany
    @JoinTable(name  = "Documento_estados", 
    joinColumns = @JoinColumn(name = "documentoId", referencedColumnName = "id"), 
    inverseJoinColumns = @JoinColumn(name = "EstadoId",referencedColumnName = "id"))
    private Set<Estado> estados;
}
