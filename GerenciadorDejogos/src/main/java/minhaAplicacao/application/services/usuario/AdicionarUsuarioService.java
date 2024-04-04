package minhaAplicacao.application.services.usuario;


import minhaAplicacao.domain.entities.Usuario;
import minhaAplicacao.infrastructure.database.adapters.dto.UsuarioModel;
import minhaAplicacao.infrastructure.database.adapters.usuario.AdicionarUsuarioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdicionarUsuarioService  {

    @Autowired
    private AdicionarUsuarioImpl adicionarUsuario;

    public void criarUsuario(Usuario usuario) {
        adicionarUsuario.create(domainToModel(usuario));
    }

    private UsuarioModel domainToModel(Usuario usuario){
        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.setNome(usuario.getNome());

        return usuarioModel;
    }





}
