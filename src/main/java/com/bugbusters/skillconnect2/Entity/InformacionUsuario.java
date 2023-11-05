package com.bugbusters.skillconnect2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "informacion_usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class InformacionUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fechaNacimiento;
    private String genero;
    private String imagenCabecera;
    private String titulo;
    private String biografia;
    private String direccion;
    private String celular;

    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

}
