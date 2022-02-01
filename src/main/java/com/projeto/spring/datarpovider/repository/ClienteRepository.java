package com.projeto.spring.datarpovider.repository;

import com.projeto.spring.datarpovider.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

    Optional<List<ClienteEntity>> findByNomeCompletoIgnoreCase(String nome);

}
