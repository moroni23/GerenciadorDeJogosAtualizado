package minhaAplicacao.application.services.usuario;

import minhaAplicacao.domain.ports.usuario.ExcluirUsuarioPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExcluirUsuarioService {

    @Autowired
    private ExcluirUsuarioPort excluirUsuario;


}
