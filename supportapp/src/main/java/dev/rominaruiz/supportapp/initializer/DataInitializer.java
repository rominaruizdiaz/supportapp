package dev.rominaruiz.supportapp.initializer;

import dev.rominaruiz.supportapp.models.Usuario;
import dev.rominaruiz.supportapp.repositories.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final UsuarioRepository usuarioRepository;

    public DataInitializer(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public void run(String... args) {
        
        Usuario usuario1 = new Usuario();
        usuario1.setUsuario("usuario1");
        usuario1.setContraseña("contrasena1");
        usuarioRepository.save(usuario1);

        Usuario usuario2 = new Usuario();
        usuario2.setUsuario("usuario2");
        usuario2.setContraseña("contrasena2");
        usuarioRepository.save(usuario2);
    }
}