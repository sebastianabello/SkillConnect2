package com.bugbusters.skillconnect2.Controller;

import com.bugbusters.skillconnect2.Entity.Publicacion;
import com.bugbusters.skillconnect2.Service.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publicaciones")
public class PublicacionController {
    @Autowired
    private PublicacionService publicacionService;

    @GetMapping
    public List<Publicacion> obtenerTodasLasPublicaciones() {
        return publicacionService.obtenerTodasLasPublicaciones();
    }

    @GetMapping("/{id}")
    public Publicacion obtenerPublicacionPorId(@PathVariable Long id) {
        return publicacionService.obtenerPublicacionPorId(id);
    }

    @PostMapping
    public void guardarPublicacion(@RequestBody Publicacion publicacion) {
        publicacionService.guardarPublicacion(publicacion);
    }

    @DeleteMapping("/{id}")
    public void eliminarPublicacion(@PathVariable Long id) {
        publicacionService.eliminarPublicacion(id);
    }
}
