package br.com.futurodev.bibliotecarevisao.controllers;

import br.com.futurodev.bibliotecarevisao.entities.Autor;
import br.com.futurodev.bibliotecarevisao.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("autor")
public class AutorController {

    @Autowired
    private AutorService autorService; //injeção dependência

        @GetMapping
        public List<Autor> get(){

            return autorService.buscarTodos();
        }

        @PostMapping
        public Autor post(@RequestBody Autor autor){
            return autorService.salvar(autor);
        }
}
