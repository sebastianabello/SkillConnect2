package com.bugbusters.skillconnect2.Service;

import com.bugbusters.skillconnect2.Entity.PublicacionGuardada;
import com.bugbusters.skillconnect2.Entity.Usuario;
import com.bugbusters.skillconnect2.Repository.PublicacionGuardadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacionGuardadaService {
    @Autowired
    private PublicacionGuardadaRepository publicacionGuardadaRepository;

    public List<PublicacionGuardada> obtenerPublicacionesGuardadasPorUsuario(Usuario usuario) {
        return publicacionGuardadaRepository.findByUsuario(usuario);
    }

    public void guardarPublicacionGuardada(PublicacionGuardada publicacionGuardada) {
        publicacionGuardadaRepository.save(publicacionGuardada);
    }
}
