package com.bugbusters.skillconnect2.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class InformacionAdicionalUsuario {
    @Id
    private Long usuarioId;
    private String fechaNacimiento;
    private String genero;
    private String pais;
    private String imgCabecera;
    private String titulo;
    private String biografia;
    private String direccion;
    private String celular;

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    @OneToOne
    @JoinColumn(name = "usuarioId")
    private Usuario usuario;

}
