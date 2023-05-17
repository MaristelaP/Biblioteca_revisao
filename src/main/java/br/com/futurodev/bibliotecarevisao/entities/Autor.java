package br.com.futurodev.bibliotecarevisao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Autor {

    @Id
    private long id;
}
