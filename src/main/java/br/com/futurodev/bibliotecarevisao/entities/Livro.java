package br.com.futurodev.bibliotecarevisao.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Livro {

    @Id
    @Column(name = "livro_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String titulo;

    @Column(length = 150)
    private String subtitulo;

    @ManyToOne
    @JoinColumn(name = "autor_id", nullable = false)
    private Autor autor;

    @Column(length = 20, nullable = false)
    private String categoria;

    @Column(length = 20, nullable = false)
    private String editora;

    @Column(nullable = false)
    private Integer exemplares = 0; //Integer classe true false e null

    @Column(nullable = false)
    private Boolean disponibilidade = false;
}
