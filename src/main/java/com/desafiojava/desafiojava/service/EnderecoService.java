package com.desafiojava.desafiojava.service;

import com.desafiojava.desafiojava.exception.CustomException;
import com.desafiojava.desafiojava.model.Endereco;
import com.desafiojava.desafiojava.model.Pessoa;
import com.desafiojava.desafiojava.repository.PessoaRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EnderecoService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public Endereco criarEndereco(Long pessoaId, Endereco endereco){
        Pessoa pessoa = pessoaRepository.findById(pessoaId).orElseThrow(() -> new CustomException("Pessoa não encontrada", HttpStatus.NOT_FOUND));
        pessoa.getEnderecos().add(endereco);
        pessoaRepository.save(pessoa);
        return endereco;
    }

    public List<Endereco> listarEnderecos(Long pessoaId){
        Pessoa pessoa = pessoaRepository.findById(pessoaId).orElseThrow(() -> new CustomException("Pessoa não encontrada", HttpStatus.NOT_FOUND));
        return pessoa.getEnderecos();
    }

    public Endereco consultarEnderecoPrincipal(Long pessoaId){
        Pessoa pessoa = pessoaRepository.findById(pessoaId).orElseThrow(() -> new CustomException("Pessoa não encontrada", HttpStatus.NOT_FOUND));
        return pessoa.getEnderecoPrincipal();
    }
}
