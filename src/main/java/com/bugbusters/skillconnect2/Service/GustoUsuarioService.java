package com.bugbusters.skillconnect2.Service;

import com.bugbusters.skillconnect2.Entity.GustoUsuario;
import com.bugbusters.skillconnect2.Entity.Usuario;
import com.bugbusters.skillconnect2.Repository.GustoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GustoUsuarioService {
    @Autowired
    private GustoUsuarioRepository gustoUsuarioRepository;

    public GustoUsuario crearGustoUsuario(GustoUsuario gustoUsuario) {
        return gustoUsuarioRepository.save(gustoUsuario);
    }

    public List<GustoUsuario> obtenerGustosDeUsuario(Usuario usuario) {
        return gustoUsuarioRepository.findByUsuario(usuario);
    }

    public void eliminarGustoUsuario(Long id) {
        gustoUsuarioRepository.deleteById(id);
    }
}
