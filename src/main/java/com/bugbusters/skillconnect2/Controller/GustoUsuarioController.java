package com.bugbusters.skillconnect2.Controller;

import com.bugbusters.skillconnect2.Entity.GustoUsuario;
import com.bugbusters.skillconnect2.Entity.Usuario;
import com.bugbusters.skillconnect2.Service.GustoUsuarioService;
import com.bugbusters.skillconnect2.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gustos-usuario")

public class GustoUsuarioController {
    @Autowired
    private GustoUsuarioService gustoUsuarioService;
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public GustoUsuario crearGustoUsuario(@RequestBody GustoUsuario gustoUsuario) {
        return gustoUsuarioService.crearGustoUsuario(gustoUsuario);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<GustoUsuario> obtenerGustosDeUsuario(@PathVariable Long usuarioId) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(usuarioId);
        return gustoUsuarioService.obtenerGustosDeUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminarGustoUsuario(@PathVariable Long id) {
        gustoUsuarioService.eliminarGustoUsuario(id);
    }
}
