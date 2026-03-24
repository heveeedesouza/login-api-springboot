package com.hevellyn.loginapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.hevellyn.loginapi.model.Usuario;
import com.hevellyn.loginapi.service.UsuarioServico;

@RestController
@RequestMapping("/auth")
public class UsuarioController {

    private final UsuarioServico service;

    public UsuarioController(UsuarioServico servico) {
        this.service = servico;
    }

    @PostMapping("/register")
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        return service.cadastrar(usuario);
    }

    @PostMapping("/login")
    public String login(@RequestBody Usuario usuario) {
        boolean sucesso = service.login(usuario.getEmail(), usuario.getSenha());

        if (sucesso) {
            return "Login realizado com sucesso!";
        } else {
            return "Credenciais inválidas";
        }
    }

    @GetMapping("/usuarios")
    public List<Usuario> listar() {
        return service.listarTodos();
    }
}