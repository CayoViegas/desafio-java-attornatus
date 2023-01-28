package com.desafiojava.desafiojava.service;

import com.desafiojava.desafiojava.Endereco;
import com.desafiojava.desafiojava.repository.EnderecoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EnderecoService {
    private final EnderecoRepository enderecoRepository;

    //criar endereco
    public Endereco create(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    //listar todos os enderecos
    public List<Endereco> getAll() {
        return enderecoRepository.findAll();
    }

    //listar um endereco (principal)
    public Endereco getById(Long id) {
        return enderecoRepository.findById(id).get();
    }
}
