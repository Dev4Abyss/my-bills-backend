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
        if (repository.existsByEmail(usuario.getEmail())) {
            throw new RuntimeException("Usuário já existe com o email: " + usuario.getEmail());
        }
        return repository.save(usuario);
    }

    public List<Usuario> listarTudo() {
        return repository.findAll();
    }
}
