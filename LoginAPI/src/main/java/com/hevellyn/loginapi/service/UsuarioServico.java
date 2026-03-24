package com.hevellyn.loginapi.service;

import com.hevellyn.loginapi.model.Usuario;
import com.hevellyn.loginapi.repository.UsuarioRepositorio;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioServico {

    private final UsuarioRepositorio repositorio;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public UsuarioServico(UsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario cadastrar(Usuario usuario) {
        usuario.setSenha(encoder.encode(usuario.getSenha()));
        return repositorio.save(usuario);
    }

    public boolean login(String email, String senha) {
        var usuario = repositorio.findByEmail(email);

        if (usuario.isPresent()) {
            return encoder.matches(senha, usuario.get().getSenha());
        }
        return false;
    }

    public List<Usuario> listarTodos() {
        return repositorio.findAll();
    }
}