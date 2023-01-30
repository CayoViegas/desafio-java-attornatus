package com.desafiojava.desafiojava.service;

import com.desafiojava.desafiojava.model.Pessoa;
import com.desafiojava.desafiojava.repository.PessoaRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa criarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa atualizarPessoa(Long id, Pessoa pessoa) {
        Pessoa pessoaExistente = pessoaRepository.findById(id).orElse(null);
        if (pessoaExistente != null) {
            pessoaExistente.setNome(pessoa.getNome());
            pessoaExistente.setDataDeNascimento(pessoa.getDataDeNascimento());
            return pessoaRepository.save(pessoaExistente);
        }
        return null;
    }

    public Pessoa consultarPessoa(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }

    public List<Pessoa> listarPessoas() {
        return pessoaRepository.findAll();
    }
}
