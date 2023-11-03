package com.bugbusters.skillconnect2.Service;

import com.bugbusters.skillconnect2.Entity.Categoria;
import com.bugbusters.skillconnect2.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> obtenerTodasLasCategorias() {
        return categoriaRepository.findAll();
    }
}
