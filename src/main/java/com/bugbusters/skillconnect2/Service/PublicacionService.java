package com.bugbusters.skillconnect2.Service;

import com.bugbusters.skillconnect2.Entity.Publicacion;
import com.bugbusters.skillconnect2.Repository.PublicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacionService {
    @Autowired
    private PublicacionRepository publicacionRepository;

    public List<Publicacion> obtenerTodasLasPublicaciones() {
        return publicacionRepository.findAll();
    }

    public Publicacion obtenerPublicacionPorId(Long id) {
        return publicacionRepository.findById(id).orElse(null);
    }

    public void guardarPublicacion(Publicacion publicacion) {
        publicacionRepository.save(publicacion);
    }

    public void eliminarPublicacion(Long id) {
        publicacionRepository.deleteById(id);
    }
}
