package br.com.rendersonjunior.jornadamilhas.service;

import br.com.rendersonjunior.jornadamilhas.dto.DepoimentoDTO;
import br.com.rendersonjunior.jornadamilhas.mapper.DepoimentoMapper;
import br.com.rendersonjunior.jornadamilhas.model.Depoimento;
import br.com.rendersonjunior.jornadamilhas.repository.DepoimentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static org.apache.commons.lang3.BooleanUtils.isFalse;

@Service
@RequiredArgsConstructor
public class DepoimentoService {

    public final DepoimentoRepository depoimentoRepository;

    public final DepoimentoMapper depoimentoMapper;

    public List<Depoimento> getAll() {
        return depoimentoRepository.findAll();

    }

    public Depoimento getById(Long depoimentoId) {
        return depoimentoRepository.findById(depoimentoId)
                .orElseThrow(() -> new RuntimeException("Depoimento não encontrado!"));

    }

    public Depoimento post(final Depoimento depoimento) {
        return depoimentoRepository.save(depoimento);

    }

    public void delete(final Long depoimentoId) {
        depoimentoRepository.delete(this.getById(depoimentoId));

    }

    public void put(final long id, final Depoimento depoimento) {
        Depoimento updateDepoimento = this.getById(id);

        if (isFalse(depoimento.getDepoimento().isBlank()))
            updateDepoimento.setDepoimento( depoimento.getDepoimento() );

        depoimentoRepository.update(updateDepoimento);
    }

}
