package br.com.arquitetura.hexagonal.arquiteturaHexagonal.adapters.outbound.repository;

import br.com.arquitetura.hexagonal.arquiteturaHexagonal.adapters.outbound.entity.VisitaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitaRepository extends JpaRepository<VisitaEntity, Long> {
}
