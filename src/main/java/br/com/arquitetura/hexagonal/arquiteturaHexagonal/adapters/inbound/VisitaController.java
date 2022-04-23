package br.com.arquitetura.hexagonal.arquiteturaHexagonal.adapters.inbound;

import br.com.arquitetura.hexagonal.arquiteturaHexagonal.adapters.inbound.request.VisitaRequest;
import br.com.arquitetura.hexagonal.arquiteturaHexagonal.adapters.outbound.mapper.VisitaMapper;
import br.com.arquitetura.hexagonal.arquiteturaHexagonal.application.core.domain.Visita;
import br.com.arquitetura.hexagonal.arquiteturaHexagonal.application.ports.in.AgendarVisitaServicePort;
import lombok.AllArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class VisitaController {

    private final AgendarVisitaServicePort agendarVisitaPort;
    private final VisitaMapper mapper = Mappers.getMapper(VisitaMapper.class);

    @PostMapping("/agendar-visita")
    public ResponseEntity<?> post(@RequestBody VisitaRequest visitaRequest) {
        Visita visitaAgendada = agendarVisitaPort.agendarVisita(mapper.mapToVisita(visitaRequest));
        return ResponseEntity.ok(visitaAgendada);
    }

}
