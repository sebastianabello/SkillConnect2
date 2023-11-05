package com.bugbusters.skillconnect2.Controller;


import com.bugbusters.skillconnect2.Entity.Publicacion;
import com.bugbusters.skillconnect2.Entity.Solicitud;
import com.bugbusters.skillconnect2.Entity.Usuario;
import com.bugbusters.skillconnect2.Service.PublicacionService;
import com.bugbusters.skillconnect2.Service.SolicitudService;
import com.bugbusters.skillconnect2.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/solicitudes")
public class SolicitudController {
    @Autowired
    private SolicitudService solicitudService;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private PublicacionService publicacionService;

    @PostMapping
    public Solicitud crearSolicitud(@RequestBody Solicitud solicitud) {
        return solicitudService.crearSolicitud(solicitud);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Solicitud> obtenerSolicitudesDeUsuario(@PathVariable Long usuarioId) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(usuarioId);
        return solicitudService.obtenerSolicitudesDeUsuario(usuario);
    }

    @GetMapping("/publicacion/{publicacionId}")
    public List<Solicitud> obtenerSolicitudesDePublicacion(@PathVariable Long publicacionId) {
        Publicacion publicacion = publicacionService.obtenerPublicacionPorId(publicacionId);
        return solicitudService.obtenerSolicitudesDePublicacion(publicacion);
    }

    @DeleteMapping("/{id}")
    public void eliminarSolicitud(@PathVariable Long id) {
        solicitudService.eliminarSolicitud(id);
    }
}
