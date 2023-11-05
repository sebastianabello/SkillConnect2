package com.bugbusters.skillconnect2.Repository;

import com.bugbusters.skillconnect2.Entity.Categoria;
import com.bugbusters.skillconnect2.Entity.Publicacion;
import com.bugbusters.skillconnect2.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {
    //Consulta para buscar publicaciones por categoría.
    List<Publicacion> findByCategoria(Categoria categoria);
    //Consulta para buscar publicaciones creadas por un usuario específico.
    List<Publicacion> findByUsuario(Usuario usuario);
}
