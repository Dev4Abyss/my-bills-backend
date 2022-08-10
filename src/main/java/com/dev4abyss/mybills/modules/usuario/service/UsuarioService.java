package com.dev4abyss.mybills.modules.usuario.service;

import com.dev4abyss.mybills.modules.usuario.entity.Usuario;
import com.dev4abyss.mybills.modules.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public void save(Usuario usuario) {
        repository.save(usuario);
    }
}
