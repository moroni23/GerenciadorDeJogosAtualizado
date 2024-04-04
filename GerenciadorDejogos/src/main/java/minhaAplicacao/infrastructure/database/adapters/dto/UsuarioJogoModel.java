package minhaAplicacao.infrastructure.database.adapters.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class UsuarioJogoModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Nome", nullable = false)
    private String nome;

    @Column(name = "Horas_Jogadas")
    private String horas_jogadas;

    @Column(name = "Status")
    private String Status;


}

