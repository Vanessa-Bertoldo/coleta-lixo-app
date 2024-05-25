package br.com.app.coleta.lixo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Caminhao {

    @Id
    private String id;

    private String modelo;

    private String capacidade;

    private String nomeStatus;

    private String capacidadeMaxima;
}
