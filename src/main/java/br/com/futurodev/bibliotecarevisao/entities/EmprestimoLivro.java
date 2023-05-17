package br.com.futurodev.bibliotecarevisao.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class EmprestimoLivro {

    @Id
    @Column(name = "emprestimo_livro_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//ctrl espaço para ver mais opções
    private Long id;                                     //identity autoincrementa

    @ManyToOne
    @JoinColumn(name = "emprestimo_id", nullable = false)
    private Emprestimo emprestimo;

    @ManyToOne
    @JoinColumn(name = "livro_id", nullable = false)
    private Livro livro;

    @Column(nullable = false)
    private Date dataPrevista = new Date();

    private Date dataDevolucao;
}
