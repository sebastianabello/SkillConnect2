package com.bugbusters.skillconnect2.Repository;

import com.bugbusters.skillconnect2.Entity.Publicacion;
import com.bugbusters.skillconnect2.Entity.Solicitud;
import com.bugbusters.skillconnect2.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
    //Consulta para buscar solicitudes realizadas por un usuario específico.
    List<Solicitud> findByUsuario(Usuario usuario);
    //Consulta para buscar solicitudes relacionadas con una publicación específica.
    List<Solicitud> findByPublicacion(Publicacion publicacion);

}
