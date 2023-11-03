package com.bugbusters.skillconnect2.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "publicaciones_guardadas")
public class PublicacionGuardada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "publicacion_id")
    private Publicacion publicacion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_guardado")
    private Date fechaGuardado;

    // Getters y setters
}
