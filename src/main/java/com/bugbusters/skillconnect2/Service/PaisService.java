package com.bugbusters.skillconnect2.Service;

import com.bugbusters.skillconnect2.Entity.Pais;
import com.bugbusters.skillconnect2.Repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {
    @Autowired
    private PaisRepository paisRepository;

    public List<Pais> obtenerTodosLosPaises() {
        return paisRepository.findAll();
    }
}
