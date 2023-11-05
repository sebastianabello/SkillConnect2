package com.bugbusters.skillconnect2.Service;

import com.bugbusters.skillconnect2.Entity.InformacionUsuario;
import com.bugbusters.skillconnect2.Entity.Usuario;
import com.bugbusters.skillconnect2.Repository.InformacionUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InformacionUsuarioService {
    @Autowired
    private InformacionUsuarioRepository informacionUsuarioRepository;

    public InformacionUsuario crearInformacionUsuario(InformacionUsuario informacionUsuario) {
        return informacionUsuarioRepository.save(informacionUsuario);
    }

    public InformacionUsuario obtenerInformacionUsuarioPorUsuario(Usuario usuario) {
        return informacionUsuarioRepository.findByUsuario(usuario);
    }

    public void eliminarInformacionUsuario(Long id) {
        informacionUsuarioRepository.deleteById(id);
    }
}
