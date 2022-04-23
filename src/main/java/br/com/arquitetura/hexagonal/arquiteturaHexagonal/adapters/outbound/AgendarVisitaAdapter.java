package br.com.arquitetura.hexagonal.arquiteturaHexagonal.adapters.outbound;

import br.com.arquitetura.hexagonal.arquiteturaHexagonal.adapters.outbound.entity.VisitaEntity;
import br.com.arquitetura.hexagonal.arquiteturaHexagonal.adapters.outbound.mapper.VisitaMapper;
import br.com.arquitetura.hexagonal.arquiteturaHexagonal.adapters.outbound.repository.VisitaRepository;
import br.com.arquitetura.hexagonal.arquiteturaHexagonal.application.core.domain.Visita;
import br.com.arquitetura.hexagonal.arquiteturaHexagonal.application.ports.out.AgendarVisitaPort;
import lombok.AllArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@AllArgsConstructor
public class AgendarVisitaAdapter implements AgendarVisitaPort {

    private final VisitaRepository visitaRepository;
    private final VisitaMapper mapper = Mappers.getMapper(VisitaMapper.class);

    @Override
    @Transactional
    public Visita agendarVisita(Visita visita) {
        VisitaEntity visitaAgendada = mapper.mapToVisitaEntity(visita);
        visitaRepository.save(visitaAgendada);
        return mapper.mapToVisita(visitaAgendada);
    }
}
