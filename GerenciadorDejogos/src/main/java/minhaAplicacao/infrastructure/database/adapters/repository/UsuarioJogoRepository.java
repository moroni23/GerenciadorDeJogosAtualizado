package minhaAplicacao.infrastructure.database.adapters.repository;

import minhaAplicacao.domain.entities.Jogo;
import minhaAplicacao.infrastructure.database.adapters.dto.UsuarioJogoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJogoRepository extends JpaRepository<UsuarioJogoModel,Long > {
    void delete(Integer usuarioJogoModel);
}
