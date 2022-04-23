package br.com.arquitetura.hexagonal.arquiteturaHexagonal.application.ports.in;

import br.com.arquitetura.hexagonal.arquiteturaHexagonal.application.core.domain.Visita;

public interface AgendarVisitaServicePort {

    Visita agendarVisita(Visita visita);

}
