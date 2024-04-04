package minhaAplicacao.application.controllers;


import minhaAplicacao.application.services.usuario.ExcluirUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    public ExcluirUsuarioService excluirUsuarioService;
}
