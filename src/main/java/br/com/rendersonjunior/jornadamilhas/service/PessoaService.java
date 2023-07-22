package br.com.rendersonjunior.jornadamilhas.service;

import br.com.rendersonjunior.jornadamilhas.mapper.PessoaMapper;
import br.com.rendersonjunior.jornadamilhas.model.Depoimento;
import br.com.rendersonjunior.jornadamilhas.model.Pessoa;
import br.com.rendersonjunior.jornadamilhas.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.apache.commons.lang3.BooleanUtils.isFalse;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    private final PessoaMapper pessoaMapper;

    public List<Pessoa> getAll() {
        return pessoaRepository.findAll();

    }

    public Pessoa getById(Long pessoaId) {
        return pessoaRepository.findById(pessoaId)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada!"));

    }

    public Pessoa post(final Pessoa pessoa) {
        return pessoaRepository.save(pessoa);

    }

    public void delete(final Long pessoaId) {
        pessoaRepository.delete(this.getById(pessoaId));

    }

    public void put(final long id, final Pessoa pessoa) {
        Pessoa updatePessoa = this.getById(id);

        if (isFalse(pessoa.getCpf().isBlank()))
            updatePessoa.setCpf( pessoa.getCpf() );

        if (isFalse(pessoa.getNome().isBlank()))
            updatePessoa.setNome( pessoa.getNome());

        if (isFalse(pessoa.getEmail().isBlank()))
            updatePessoa.setEmail( pessoa.getEmail());


        pessoaRepository.update(updatePessoa);
    }

}
