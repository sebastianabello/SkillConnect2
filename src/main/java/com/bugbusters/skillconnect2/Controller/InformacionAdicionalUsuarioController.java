package com.bugbusters.skillconnect2.Controller;

import com.bugbusters.skillconnect2.Entity.InformacionAdicionalUsuario;
import com.bugbusters.skillconnect2.Service.InformacionAdicionalUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/informacion-adicional-usuario")
public class InformacionAdicionalUsuarioController {
    @Autowired
    private InformacionAdicionalUsuarioService informacionAdicionalUsuarioService;

    @GetMapping("/{usuarioId}")
    public InformacionAdicionalUsuario obtenerInformacionPorUsuario(@PathVariable Long usuarioId) {
        return informacionAdicionalUsuarioService.obtenerInformacionPorUsuario(usuarioId);
    }

    @PutMapping("/{usuarioId}")
    public void actualizarInformacionAdicionalUsuario(@PathVariable Long usuarioId, @RequestBody InformacionAdicionalUsuario informacionAdicionalUsuario) {
        informacionAdicionalUsuario.setUsuarioId(usuarioId); // Asegúrate de configurar el ID del usuario
        informacionAdicionalUsuarioService.actualizarInformacionAdicionalUsuario(informacionAdicionalUsuario);
    }
}
