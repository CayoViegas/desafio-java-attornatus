package com.desafiojava.desafiojava;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "endereco")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String logradouro;

    @Column(unique = true, nullable = false)
    private String cep;

    @Column(unique = true, nullable = false)
    private String numero;

    @Column(unique = true, nullable = false)
    private String cidade;
}
