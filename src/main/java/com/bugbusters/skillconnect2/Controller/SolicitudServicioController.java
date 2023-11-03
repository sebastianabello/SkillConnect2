package com.bugbusters.skillconnect2.Controller;


import com.bugbusters.skillconnect2.Entity.SolicitudServicio;
import com.bugbusters.skillconnect2.Entity.Usuario;
import com.bugbusters.skillconnect2.Service.SolicitudServicioService;
import com.bugbusters.skillconnect2.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitudes-servicio")
public class SolicitudServicioController {
    @Autowired
    private UsuarioService usuarioService; // Asegúrate de que la dependencia esté correctamente inyectada
    @Autowired
    private SolicitudServicioService solicitudServicioService; // Asegúrate de que la dependencia esté correctamente inyectada

    @GetMapping("/{usuarioId}")
    public List<SolicitudServicio> obtenerSolicitudesPorUsuario(@PathVariable Long usuarioId) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(usuarioId);
        return solicitudServicioService.obtenerSolicitudesPorUsuario(usuario);
    }

    @PostMapping
    public void guardarSolicitudServicio(@RequestBody SolicitudServicio solicitudServicio) {
        solicitudServicioService.guardarSolicitudServicio(solicitudServicio);
    }
}
