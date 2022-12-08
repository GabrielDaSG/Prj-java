package org.senai.projetojava.repository;

import org.senai.projetojava.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {
    
}
