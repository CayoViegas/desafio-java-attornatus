package com.desafiojava.desafiojava.controller;

import com.desafiojava.desafiojava.model.Endereco;
import com.desafiojava.desafiojava.repository.EnderecoRepository;
import com.desafiojava.desafiojava.service.EnderecoService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class EnderecoController {

    private final EnderecoService enderecoService;

    @GetMapping("/endereco")
    public List<Endereco> getAllEnderecos() {
        return enderecoService.getAll();
    }

    public Optional<Endereco> getEnderecoById(@PathVariable Long id) {
        return Optional.ofNullable(enderecoService.getById(id));
    }

    @PostMapping("/endereco")
    public Endereco createEndereco(@RequestBody Endereco endereco) {
        return enderecoService.create(endereco);
    }
}
