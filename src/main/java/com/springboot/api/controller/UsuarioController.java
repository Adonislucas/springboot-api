package com.springboot_api.controller;

import com.springboot_api.model.Usuario;
import com.springboot_api.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepositorio repositorio;

    @GetMapping()
    public List<Usuario> getUsers(){
        return repositorio.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repositorio.findByUsername(username);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Integer id){
         repositorio.deleteById(id);

    }

    @PostMapping("/save")
    public void postUser(@RequestBody Usuario usuario){
         repositorio.save(usuario);
    }

}
