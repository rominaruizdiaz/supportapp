import org.springframework.data.jpa.repository.JpaRepository;
import dev.verosampedro.SupportAppProject.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsuario(String usuario);
}