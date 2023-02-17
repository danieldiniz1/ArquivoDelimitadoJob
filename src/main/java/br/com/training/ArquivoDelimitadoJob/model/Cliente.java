package br.com.training.ArquivoDelimitadoJob.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class Cliente {

    private String nome;
    private String sobrenome;
    private String idade;
    private String email;

}
