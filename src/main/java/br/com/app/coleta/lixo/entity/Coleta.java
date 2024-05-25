package br.com.app.coleta.lixo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Coleta {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String nomeBairro;

    private String numeroVolume;



}
