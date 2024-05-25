package br.com.app.coleta.lixo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Rota {


    @Id
    private Long id;

    private String data;

    private String status;
}
