package com.desafiojava.desafiojava;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nome;

    @Column(unique = true, nullable = false)
    private Date dataDeNascimento;

    @Column(unique = true)
    private Endereco enderecoPrincipal;

    @OneToMany
    @Column(unique = true, nullable = false)
    private List<Endereco> enderecos;
}
