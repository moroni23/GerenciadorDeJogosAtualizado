package minhaAplicacao.domain.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Jogo {

    private String nome;
    private String horas_jogadas;
    private String status;

}
