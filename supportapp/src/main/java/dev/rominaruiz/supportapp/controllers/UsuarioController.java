package dev.rominaruiz.supportapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import dev.rominaruiz.supportapp.models.Usuario;
import dev.rominaruiz.supportapp.repositories.UsuarioRepository;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Usuario credenciales) {
        Usuario usuario = usuarioRepository.findByUsuario(credenciales.getUsuario());

        if (usuario != null && usuario.getContraseña().equals(credenciales.getContraseña())) {
            return ResponseEntity.ok("Inicio de sesión completado");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }
}
