package br.com.futurodev.bibliotecarevisao.repositories;

import br.com.futurodev.bibliotecarevisao.entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
}
