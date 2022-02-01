package com.projeto.spring.usecase.gateway;

import com.projeto.spring.usecase.domain.request.ClienteDomainRequest;
import com.projeto.spring.usecase.domain.response.ClienteDomainResponse;

import java.util.List;
import java.util.Optional;

public interface ClienteGateway {

    Optional<List<ClienteDomainResponse>> listarClientePorNome(String nome);

    ClienteDomainResponse listarClientePorId(Long id);

    void deletarCliente(Long id);

    void salvarCliente(ClienteDomainRequest cliente, Long id);

    void inserirCliente(ClienteDomainRequest cliente);
}
