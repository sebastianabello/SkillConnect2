package com.bugbusters.skillconnect2.Controller;

import com.bugbusters.skillconnect2.Entity.Pais;
import com.bugbusters.skillconnect2.Service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paises")
public class PaisController {
    @Autowired
    private PaisService paisService;

    @GetMapping
    public List<Pais> obtenerTodosLosPaises() {
        return paisService.obtenerTodosLosPaises();
    }
}
