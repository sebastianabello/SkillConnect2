package com.bugbusters.skillconnect2.Service;

import com.bugbusters.skillconnect2.Entity.PaisDisponible;
import com.bugbusters.skillconnect2.Repository.PaisDisponibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisDisponibleService {
    @Autowired
    private PaisDisponibleRepository paisDisponibleRepository;

    public List<PaisDisponible> obtenerTodosLosPaises() {
        return paisDisponibleRepository.findAll();
    }
}
