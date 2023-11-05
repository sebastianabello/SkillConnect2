package com.bugbusters.skillconnect2.Service;

import com.bugbusters.skillconnect2.Entity.Publicacion;
import com.bugbusters.skillconnect2.Entity.Solicitud;
import com.bugbusters.skillconnect2.Entity.Usuario;
import com.bugbusters.skillconnect2.Repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudService {
    @Autowired
    private SolicitudRepository solicitudRepository;

    public Solicitud crearSolicitud(Solicitud solicitud) {
        // Agregar lógica adicional si es necesario
        return solicitudRepository.save(solicitud);
    }

    public List<Solicitud> obtenerSolicitudesDeUsuario(Usuario usuario) {
        return solicitudRepository.findByUsuario(usuario);
    }

    public List<Solicitud> obtenerSolicitudesDePublicacion(Publicacion publicacion) {
        return solicitudRepository.findByPublicacion(publicacion);
    }

    public void eliminarSolicitud(Long id) {
        solicitudRepository.deleteById(id);
    }
}
