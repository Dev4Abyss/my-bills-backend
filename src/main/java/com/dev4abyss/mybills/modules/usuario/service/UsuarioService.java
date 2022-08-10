package com.dev4abyss.mybills.modules.usuario.service;

import com.dev4abyss.mybills.modules.usuario.entity.Usuario;
import com.dev4abyss.mybills.modules.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario save(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> listarTudo(){
        return repository.findAll();
    }
}
