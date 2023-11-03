package com.bugbusters.skillconnect2.Repository;

import com.bugbusters.skillconnect2.Entity.SolicitudServicio;
import com.bugbusters.skillconnect2.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SolicitudServicioRepository extends JpaRepository<SolicitudServicio, Long> {
    List<SolicitudServicio> findByUsuarioSolicitante(Usuario usuario);

}
