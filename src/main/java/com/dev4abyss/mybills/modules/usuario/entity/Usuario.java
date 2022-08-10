package com.dev4abyss.mybills.modules.usuario.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tb_usuario" )
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome_completo")
    private String nomeCompleto;

    @Column(name = "apelido")
    private String apelido;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

}
