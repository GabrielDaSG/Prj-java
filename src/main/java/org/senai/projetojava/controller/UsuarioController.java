package org.senai.projetojava.controller;

import org.senai.projetojava.entity.Usuario;
import org.senai.projetojava.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// http://localhost:8080/api/usuario/add?nome=gabriel&email=gabriel@gmail.com

@Controller
@RequestMapping(path = "/api/usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioRepository uRepository;

    @PostMapping("/add")
    public @RequestBody String addUsuario(
            @RequestParam  String nome,
            @RequestParam  String email){
        Usuario ObjU = new Usuario();
        ObjU.SetNome(nome);
        ObjU.SetEmail(email);
        uRepository.save(ObjU);

        return "Salvo";

     }

     @GetMapping("/all")
     public @RequestBody Interable<Usuario> buscaUsuarios(){
     return uRepository.findAll();
     }   
}
