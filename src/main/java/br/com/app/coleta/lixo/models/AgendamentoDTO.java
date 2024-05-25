package br.com.app.coleta.lixo.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AgendamentoDTO {

    private String dataColeta;
    private String horaColeta;
    private String bairro;
    private String cidade;

}
