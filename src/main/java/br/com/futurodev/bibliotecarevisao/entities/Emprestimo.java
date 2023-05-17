package br.com.futurodev.bibliotecarevisao.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Emprestimo {

    @Id
    @Column(name = "emprestimo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(nullable = false)
    private Date dataEmprestimo = new Date(); //o java entende que camelCase se transforma em snack_case no sql

    //precisa criar uma lista para armazenar o emprestimoLivro
    //oneToMany emprestimoLivro só existe se emprestimo existe, emprestimoLivro depende de emprestimo
    //orphanRemoval true => remove o filho de empretimo, se remover emprestimo automaticamente remove emprestimo livro
    //cascade abre um acesso para manipular algo, neste caso para amipular tudo all ctrl espaço mostra outras opções
    @OneToMany(mappedBy = "emprestimo", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<EmprestimoLivro> emprestimoLivroList = new ArrayList<>();

}

