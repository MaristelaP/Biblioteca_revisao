package br.com.futurodev.bibliotecarevisao.services;

import br.com.futurodev.bibliotecarevisao.entities.Autor;
import br.com.futurodev.bibliotecarevisao.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository; //injeção dependência

    public List<Autor> buscarTodos(){

        return autorRepository.findAll();
    }

    public Autor salvar(Autor autor){
        return autor;
    }

}
