package com.bugbusters.skillconnect2.Repository;

import com.bugbusters.skillconnect2.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
