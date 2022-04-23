package br.com.arquitetura.hexagonal.arquiteturaHexagonal.application.ports.out;

import br.com.arquitetura.hexagonal.arquiteturaHexagonal.application.core.domain.Visita;

public interface AgendarVisitaPort {

    Visita agendarVisita(Visita visita);

}
