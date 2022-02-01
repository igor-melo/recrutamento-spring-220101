package com.projeto.spring.usecase.service;

import com.projeto.spring.entrypoint.model.request.ClienteModelRequest;
import com.projeto.spring.usecase.domain.request.ClienteDomainRequest;
import com.projeto.spring.usecase.domain.response.ClienteDomainResponse;
import com.projeto.spring.usecase.gateway.ClienteGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ClienteUseCase {


    private ClienteGateway clienteGateway;

    @Autowired
    public ClienteUseCase(ClienteGateway clienteGateway) {
        this.clienteGateway = clienteGateway;
    }

    public Optional<List<ClienteDomainResponse>> listarClientePorNome(String nome){
        return clienteGateway.listarClientePorNome(nome);
    }

    public ClienteDomainResponse listarClientePorId(Long id){
        return clienteGateway.listarClientePorId(id);
    }
    public void deleteCliente(Long id){
        clienteGateway.deletarCliente(id);
    }

    public void salvarCliente(ClienteDomainRequest cliente, Long id) {
        clienteGateway.salvarCliente(cliente, id);
    }

    public void inserirCliente(ClienteDomainRequest cliente) {
        clienteGateway.inserirCliente(cliente);
    }
}
