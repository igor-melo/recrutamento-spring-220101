package com.projeto.spring.datarpovider.implementation;

import com.projeto.spring.datarpovider.entities.ClienteEntity;
import com.projeto.spring.datarpovider.mapper.ClienteDataProviderMapper;
import com.projeto.spring.datarpovider.repository.ClienteRepository;
import com.projeto.spring.usecase.domain.request.ClienteDomainRequest;
import com.projeto.spring.usecase.domain.response.ClienteDomainResponse;
import com.projeto.spring.usecase.gateway.ClienteGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class ClienteDataProvider implements ClienteGateway {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Optional<List<ClienteDomainResponse>> listarClientePorNome(String nome) {

        return clienteRepository.findByNomeCompletoIgnoreCase(nome).map(ClienteDataProviderMapper::toClienteDomain);
    }

    @Override
    public ClienteDomainResponse listarClientePorId(Long id) {
        return ClienteDataProviderMapper.toClienteDomain(Arrays.asList(clienteRepository.getById(id))).get(0);
    }

    @Override
    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public void salvarCliente(ClienteDomainRequest cliente, Long id) {
        ClienteEntity clienteEntity = clienteRepository.getById(id);
        clienteEntity.setNomeCompleto(cliente.getNomeCompleto());
        clienteRepository.save(clienteEntity);
    }

    @Override
    public void inserirCliente(ClienteDomainRequest cliente) {
        clienteRepository.save(ClienteDataProviderMapper.toClienteEntity(cliente));
    }

}
