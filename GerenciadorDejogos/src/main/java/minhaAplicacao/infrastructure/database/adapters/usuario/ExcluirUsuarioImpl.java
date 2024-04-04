package minhaAplicacao.infrastructure.database.adapters.usuario;

import minhaAplicacao.domain.ports.usuario.ExcluirUsuarioPort;
import minhaAplicacao.infrastructure.database.adapters.dto.UsuarioModel;
import minhaAplicacao.infrastructure.database.adapters.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExcluirUsuarioImpl  implements ExcluirUsuarioPort {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void delete(UsuarioModel usuarioModel) {usuarioRepository.delete(usuarioModel);}
}
