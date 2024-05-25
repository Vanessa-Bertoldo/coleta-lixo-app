package br.com.app.coleta.lixo.service;

import br.com.app.coleta.lixo.models.AgendamentoDTO;
import br.com.app.coleta.lixo.repository.ColetaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ColetaService {

    private final ColetaRepository coletaRepository;

    public void buscarTodasColeta() {
        coletaRepository.findAll();
        //TODO implementar busca JPA
    }

    public void agendarColeta(AgendamentoDTO agendamentoDTO) {

    }

    public void reagendarColeta() {

    }

    public void deletarColeta(Long idColeta) {
        coletaRepository.deleteById(idColeta);

    }

}
