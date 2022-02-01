package com.projeto.spring.datarpovider.repository;

import com.projeto.spring.datarpovider.entities.CidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface CidadeRepository extends JpaRepository<CidadeEntity, Long> {

    Optional<List<CidadeEntity>> findByNomeIgnoreCase(String nome);
    Optional<List<CidadeEntity>> findByEstadoIgnoreCase(String estado);
}
