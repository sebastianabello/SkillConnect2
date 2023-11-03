package com.bugbusters.skillconnect2.Controller;

import com.bugbusters.skillconnect2.Entity.PublicacionGuardada;
import com.bugbusters.skillconnect2.Entity.Usuario;
import com.bugbusters.skillconnect2.Service.PublicacionGuardadaService;
import com.bugbusters.skillconnect2.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publicaciones-guardadas")
public class PublicacionGuardadaController {
    //relacionado con la inyección de dependencias Asegurar de que las dependencias esten
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private PublicacionGuardadaService publicacionGuardadaService;

    @GetMapping("/{usuarioId}")
    public List<PublicacionGuardada> obtenerPublicacionesGuardadasPorUsuario(@PathVariable Long usuarioId) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(usuarioId);
        return publicacionGuardadaService.obtenerPublicacionesGuardadasPorUsuario(usuario);
    }

    @PostMapping
    public void guardarPublicacionGuardada(@RequestBody PublicacionGuardada publicacionGuardada) {
        publicacionGuardadaService.guardarPublicacionGuardada(publicacionGuardada);
    }
}
