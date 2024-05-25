package br.com.app.coleta.lixo.repository;

import br.com.app.coleta.lixo.entity.Coleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColetaRepository  extends JpaRepository<Coleta, Long> {
}
