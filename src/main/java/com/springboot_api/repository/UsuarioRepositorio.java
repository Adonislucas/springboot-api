package com.springboot_api.repository;

import com.springboot_api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepositorio {
    public void save(Usuario usuario){
        if(usuario.getId()==null)
            System.out.println("Save - Recebendo o Usuario na camada de repositório");
        else
            System.out.println("Update- Recebendo o usuario na camada de repositorio");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario);
        System.out.println(usuarios);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("Delete/id- recebendo o id: %d para excluir um usuario", id));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("List- Listando os usuarios do sitema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson", "password"));
        usuarios.add(new Usuario("adonis", "password"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("Find/username - Recebendo o username"));
        return new Usuario("adonis", "lucas");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("Find/username - Recebendo o username"));
        return new Usuario("adonis", "lucas");
    }



}
