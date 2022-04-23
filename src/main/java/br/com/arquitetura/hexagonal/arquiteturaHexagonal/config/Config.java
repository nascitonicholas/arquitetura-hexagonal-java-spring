package br.com.arquitetura.hexagonal.arquiteturaHexagonal.config;

import br.com.arquitetura.hexagonal.arquiteturaHexagonal.adapters.outbound.AgendarVisitaAdapter;
import br.com.arquitetura.hexagonal.arquiteturaHexagonal.application.core.service.AgendarVisitaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public AgendarVisitaService agendarVisita(AgendarVisitaAdapter agendarVisitaAdapter) {
        return new AgendarVisitaService(agendarVisitaAdapter);
    }

}
