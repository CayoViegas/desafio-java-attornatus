package com.desafiojava.desafiojava.repository;

import com.desafiojava.desafiojava.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
