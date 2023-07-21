package br.com.rendersonjunior.jornadamilhas.mapper;

import br.com.rendersonjunior.jornadamilhas.dto.PessoaDTO;
import br.com.rendersonjunior.jornadamilhas.model.Pessoa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaMapper {

    Pessoa fromDTO(PessoaDTO pessoaDTO);

    PessoaDTO toDTO(Pessoa pessoa);

}

