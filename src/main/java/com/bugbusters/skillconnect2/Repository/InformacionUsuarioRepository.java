package com.bugbusters.skillconnect2.Repository;

import com.bugbusters.skillconnect2.Entity.InformacionUsuario;
import com.bugbusters.skillconnect2.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformacionUsuarioRepository extends JpaRepository<InformacionUsuario, Long> {
    //Consulta para buscar información de usuario por el usuario al que pertenece.
    InformacionUsuario findByUsuario(Usuario usuario);
}
