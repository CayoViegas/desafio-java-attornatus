package com.desafiojava.desafiojava.controller;

import com.desafiojava.desafiojava.model.Pessoa;
import com.desafiojava.desafiojava.service.EnderecoService;
import com.desafiojava.desafiojava.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @Autowired
    private EnderecoService enderecoService;

    // Criar uma pessoa
    @PostMapping("/pessoa")
    public ResponseEntity<Pessoa> criarPessoa(@RequestBody Pessoa pessoa){
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.criarPessoa(pessoa));
    }

    // Editar uma pessoa
    @PutMapping("/pessoa/{id}")
    public ResponseEntity<Pessoa> atualizarPessoa(@PathVariable Long id, @RequestBody Pessoa pessoa){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.atualizarPessoa(id, pessoa));
    }

    // Consultar uma pessoa
    @GetMapping("/pessoa/{id}")
    public ResponseEntity<Pessoa> consultarPessoa(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.consultarPessoa(id));
    }

    // Listar pessoas
    @GetMapping("/pessoa")
    public ResponseEntity<List<Pessoa>> listarPessoas(){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.listarPessoas());
    }
}
