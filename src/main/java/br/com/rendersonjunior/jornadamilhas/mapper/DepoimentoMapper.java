package br.com.rendersonjunior.jornadamilhas.mapper;

import br.com.rendersonjunior.jornadamilhas.dto.DepoimentoDTO;
import br.com.rendersonjunior.jornadamilhas.model.Depoimento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepoimentoMapper {

    Depoimento fromDTO(DepoimentoDTO depoimentoDTO);

    DepoimentoDTO toDTO(Depoimento depoimento);

}
