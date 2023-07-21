package br.com.rendersonjunior.jornadamilhas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {
    long id;

    @NotBlank
    String cpf;

    @NotBlank
    String nome;

    String email;

    byte[] foto;

    LocalDateTime dataCadastro;

    LocalDateTime dataAtualizacao;

}
