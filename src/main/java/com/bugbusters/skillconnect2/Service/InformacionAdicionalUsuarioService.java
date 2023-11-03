package com.bugbusters.skillconnect2.Service;

import com.bugbusters.skillconnect2.Entity.InformacionAdicionalUsuario;
import com.bugbusters.skillconnect2.Repository.InformacionAdicionalUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InformacionAdicionalUsuarioService {
    @Autowired
    private InformacionAdicionalUsuarioRepository informacionAdicionalUsuarioRepository;

    public InformacionAdicionalUsuario obtenerInformacionPorUsuario(Long usuarioId) {
        return informacionAdicionalUsuarioRepository.findById(usuarioId).orElse(null);
    }

    public void actualizarInformacionAdicionalUsuario(InformacionAdicionalUsuario informacionAdicionalUsuario) {
        informacionAdicionalUsuarioRepository.save(informacionAdicionalUsuario);
    }
}
