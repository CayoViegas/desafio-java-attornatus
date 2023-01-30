package com.desafiojava.desafiojava.controller;

import com.desafiojava.desafiojava.model.Endereco;
import com.desafiojava.desafiojava.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService = new EnderecoService();

    @PostMapping("/pessoa/{id}/endereco")
    public ResponseEntity<Endereco> criarEndereco(@PathVariable Long id, @RequestBody Endereco endereco){
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.criarEndereco(id, endereco));
    }

    @GetMapping("/pessoa/{id}/endereco")
    public ResponseEntity<List<Endereco>> listarEnderecos(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(enderecoService.listarEnderecos(id));
    }

    @GetMapping("/pessoa/{id}/endereco/principal")
    public ResponseEntity<Endereco> consultarEnderecoPrincipal(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(enderecoService.consultarEnderecoPrincipal(id));
    }
}
