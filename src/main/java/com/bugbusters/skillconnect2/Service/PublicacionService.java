package com.bugbusters.skillconnect2.Service;

import com.bugbusters.skillconnect2.Entity.Categoria;
import com.bugbusters.skillconnect2.Entity.Publicacion;
import com.bugbusters.skillconnect2.Entity.Usuario;
import com.bugbusters.skillconnect2.Repository.PublicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacionService {
    @Autowired
    private PublicacionRepository publicacionRepository;

    public Publicacion crearPublicacion(Publicacion publicacion) {
        // Agregar lógica adicional si es necesario
        return publicacionRepository.save(publicacion);
    }

    public Publicacion obtenerPublicacionPorId(Long id) {
        return publicacionRepository.findById(id).orElse(null);
    }

    public List<Publicacion> obtenerPublicacionesPorCategoria(Categoria categoria) {
        return publicacionRepository.findByCategoria(categoria);
    }

    public List<Publicacion> obtenerPublicacionesPorUsuario(Usuario usuario) {
        return publicacionRepository.findByUsuario(usuario);
    }

    public void eliminarPublicacion(Long id) {
        publicacionRepository.deleteById(id);
    }
}
