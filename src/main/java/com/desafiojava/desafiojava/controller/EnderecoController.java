package com.desafiojava.desafiojava.controller;

import com.desafiojava.desafiojava.model.Endereco;
import com.desafiojava.desafiojava.repository.EnderecoRepository;
import com.desafiojava.desafiojava.service.EnderecoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class EnderecoController {

    EnderecoService enderecoService;

    @GetMapping("/endereco")
    public List<Endereco> getAllEnderecos() {
        return enderecoRepository.findAll();
    }

    public Optional<Endereco> getEnderecoById(@PathVariable Long id) {
        return enderecoService.get(id);
    }

    @PostMapping("/endereco")
    public Endereco createEndereco(@RequestBody Endereco endereco) {
        return enderecoService.save(endereco);
    }
}
