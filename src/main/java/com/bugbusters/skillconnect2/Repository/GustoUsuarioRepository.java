package com.bugbusters.skillconnect2.Repository;

import com.bugbusters.skillconnect2.Entity.GustoUsuario;
import com.bugbusters.skillconnect2.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GustoUsuarioRepository extends JpaRepository<GustoUsuario, Long> {
    List<GustoUsuario> findByUsuario(Usuario usuario);
}
