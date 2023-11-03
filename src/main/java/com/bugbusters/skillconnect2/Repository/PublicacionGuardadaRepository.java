package com.bugbusters.skillconnect2.Repository;

import com.bugbusters.skillconnect2.Entity.PublicacionGuardada;
import com.bugbusters.skillconnect2.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PublicacionGuardadaRepository extends JpaRepository<PublicacionGuardada, Long> {
    List<PublicacionGuardada> findByUsuario(Usuario usuario);
}
