package minhaAplicacao.infrastructure.database.adapters.repository;


import minhaAplicacao.infrastructure.database.adapters.dto.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {


}
