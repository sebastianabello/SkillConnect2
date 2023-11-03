package com.bugbusters.skillconnect2.Controller;

import com.bugbusters.skillconnect2.Entity.PaisDisponible;
import com.bugbusters.skillconnect2.Service.PaisDisponibleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/paises")
public class PaisDisponibleController {
    @Autowired
    private PaisDisponibleService paisDisponibleService;

    @GetMapping
    public List<PaisDisponible> obtenerTodosLosPaises() {
        return paisDisponibleService.obtenerTodosLosPaises();
    }
}
