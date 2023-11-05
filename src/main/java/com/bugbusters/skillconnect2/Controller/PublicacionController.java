package com.bugbusters.skillconnect2.Controller;

import com.bugbusters.skillconnect2.Entity.Categoria;
import com.bugbusters.skillconnect2.Entity.Publicacion;
import com.bugbusters.skillconnect2.Entity.Usuario;
import com.bugbusters.skillconnect2.Service.CategoriaService;
import com.bugbusters.skillconnect2.Service.PublicacionService;
import com.bugbusters.skillconnect2.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/publicaciones")
public class PublicacionController {
    @Autowired
    private PublicacionService publicacionService;
    @Autowired
    private CategoriaService categoriaService;
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Publicacion crearPublicacion(@RequestBody Publicacion publicacion) {
        return publicacionService.crearPublicacion(publicacion);
    }

    @GetMapping("/{id}")
    public Publicacion obtenerPublicacionPorId(@PathVariable Long id) {
        return publicacionService.obtenerPublicacionPorId(id);
    }

    @GetMapping("/categoria/{categoriaId}")
    public List<Publicacion> obtenerPublicacionesPorCategoria(@PathVariable Long categoriaId) {
        Categoria categoria = categoriaService.obtenerCategoriaPorId(categoriaId);
        return publicacionService.obtenerPublicacionesPorCategoria(categoria);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Publicacion> obtenerPublicacionesPorUsuario(@PathVariable Long usuarioId) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(usuarioId);
        return publicacionService.obtenerPublicacionesPorUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminarPublicacion(@PathVariable Long id) {
        publicacionService.eliminarPublicacion(id);
    }
}
