package br.com.rendersonjunior.jornadamilhas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepoimentoDTO {
    long id;

    PessoaDTO pessoa;

    String depoimento;

    LocalDateTime dataDepoimento;

}
