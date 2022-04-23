package br.com.arquitetura.hexagonal.arquiteturaHexagonal.adapters.outbound.mapper;

import br.com.arquitetura.hexagonal.arquiteturaHexagonal.adapters.inbound.request.VisitaRequest;
import br.com.arquitetura.hexagonal.arquiteturaHexagonal.adapters.outbound.entity.VisitaEntity;
import br.com.arquitetura.hexagonal.arquiteturaHexagonal.application.core.domain.Visita;
import org.mapstruct.Mapper;

@Mapper
public interface VisitaMapper {

    Visita mapToVisita(VisitaRequest visita);
    Visita mapToVisita(VisitaEntity visita);
    VisitaEntity mapToVisitaEntity(Visita visita);
}
