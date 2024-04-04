package minhaAplicacao.infrastructure.database.adapters.usuariojogos;

import minhaAplicacao.domain.ports.usuario.ExcluirUsuarioPort;
import minhaAplicacao.infrastructure.database.adapters.repository.UsuarioJogoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ExcluirJogoUsuarioImpl  implements ExcluirUsuarioPort {

    @Autowired
    private UsuarioJogoRepository usuarioJogoRepository;

    public void delete(Integer usuarioJogoModel) {
        usuarioJogoRepository.delete(usuarioJogoModel);
    }
}
