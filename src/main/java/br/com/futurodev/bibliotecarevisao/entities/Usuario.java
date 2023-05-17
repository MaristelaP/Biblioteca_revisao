package br.com.futurodev.bibliotecarevisao.entities;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Usuario {

    @Id
    @Column(name = "usuario_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 120, nullable = false)
    private String nome;

    @Column(length = 20, nullable = false)
    private String documento;

    @Column(length = 120, nullable = false)
    private String email;

    @Column(length = 16)
    private String telefone;

    @Column(nullable = false)
    private Boolean bloqueado = false; //Boolean classe tem valor true false e null
                                       //boolean primitivo tem valor true e false (não tem valor null)

}
