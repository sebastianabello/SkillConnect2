package com.bugbusters.skillconnect2.Repository;

import com.bugbusters.skillconnect2.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    //Consulta para buscar un usuario por su dirección de correo electrónico.
    Usuario findByEmail(String email);
    //Consulta personalizada para buscar usuarios cuyos nombres o apellidos contengan una palabra clave.
    @Query("SELECT u FROM Usuario u WHERE u.nombre LIKE %:keyword% OR u.apellido LIKE %:keyword%")
    List<Usuario> searchUsersByKeyword(@Param("keyword") String keyword);
}
