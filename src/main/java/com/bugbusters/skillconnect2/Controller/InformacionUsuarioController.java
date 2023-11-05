package com.bugbusters.skillconnect2.Controller;

import com.bugbusters.skillconnect2.Entity.InformacionUsuario;
import com.bugbusters.skillconnect2.Entity.Usuario;
import com.bugbusters.skillconnect2.Service.InformacionUsuarioService;
import com.bugbusters.skillconnect2.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/informacion-usuario")
public class InformacionUsuarioController {
    @Autowired
    private InformacionUsuarioService informacionUsuarioService;
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public InformacionUsuario crearInformacionUsuario(@RequestBody InformacionUsuario informacionUsuario) {
        return informacionUsuarioService.crearInformacionUsuario(informacionUsuario);
    }

    @GetMapping("/usuario/{usuarioId}")
    public InformacionUsuario obtenerInformacionUsuarioPorUsuario(@PathVariable Long usuarioId) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(usuarioId);
        return informacionUsuarioService.obtenerInformacionUsuarioPorUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminarInformacionUsuario(@PathVariable Long id) {
        informacionUsuarioService.eliminarInformacionUsuario(id);
    }
}
