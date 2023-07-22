package br.com.rendersonjunior.jornadamilhas.repository;

import br.com.rendersonjunior.jornadamilhas.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    void update(Pessoa updatePessoa);
}
