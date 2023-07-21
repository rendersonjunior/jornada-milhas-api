package br.com.rendersonjunior.jornadamilhas.repository;

import br.com.rendersonjunior.jornadamilhas.model.Depoimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepoimentoRepository extends JpaRepository<Depoimento, Long> {
}
