package com.bugbusters.skillconnect2.Service;

import com.bugbusters.skillconnect2.Entity.SolicitudServicio;
import com.bugbusters.skillconnect2.Entity.Usuario;
import com.bugbusters.skillconnect2.Repository.SolicitudServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudServicioService {
    @Autowired
    private SolicitudServicioRepository solicitudServicioRepository;

    public List<SolicitudServicio> obtenerSolicitudesPorUsuario(Usuario usuario) {
        return solicitudServicioRepository.findByUsuarioSolicitante(usuario);
    }

    public void guardarSolicitudServicio(SolicitudServicio solicitudServicio) {
        solicitudServicioRepository.save(solicitudServicio);
    }
}
