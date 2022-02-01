package com.projeto.spring.usecase.gateway;

import com.projeto.spring.usecase.domain.response.CidadeDomainResponse;

import java.util.List;
import java.util.Optional;

public interface CidadeGateway {

    Optional<List<CidadeDomainResponse>> listarCidadePorNome(String nome);
    Optional<List<CidadeDomainResponse>> listarCidadePorEstado(String estado);

}
