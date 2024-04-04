package minhaAplicacao.infrastructure.database.adapters.usuariojogos;

import minhaAplicacao.domain.ports.usuario.AdicionarUsuarioPort;
import minhaAplicacao.infrastructure.database.adapters.dto.UsuarioJogoModel;
import minhaAplicacao.infrastructure.database.adapters.repository.UsuarioJogoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AdicionarJogoListaImpl implements AdicionarUsuarioPort {

    @Autowired
    private UsuarioJogoRepository usuarioJogoRepository;

    public void create(UsuarioJogoModel usuarioJogoModel) {
        usuarioJogoRepository.save(usuarioJogoModel);
    }
}
