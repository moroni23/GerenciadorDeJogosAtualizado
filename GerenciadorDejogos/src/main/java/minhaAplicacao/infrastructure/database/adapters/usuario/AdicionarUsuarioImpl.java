package minhaAplicacao.infrastructure.database.adapters.usuario;

import minhaAplicacao.domain.ports.usuario.AdicionarUsuarioPort;
import minhaAplicacao.infrastructure.database.adapters.dto.UsuarioModel;
import minhaAplicacao.infrastructure.database.adapters.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdicionarUsuarioImpl  implements AdicionarUsuarioPort {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void create(UsuarioModel usuarioModel) {
        usuarioRepository.save(usuarioModel);

    }
}

