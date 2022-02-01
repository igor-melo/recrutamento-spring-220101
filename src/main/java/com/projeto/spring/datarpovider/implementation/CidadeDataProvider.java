package com.projeto.spring.datarpovider.implementation;

import com.projeto.spring.datarpovider.mapper.CidadeDataProviderMapper;
import com.projeto.spring.datarpovider.repository.CidadeRepository;
import com.projeto.spring.usecase.domain.response.CidadeDomainResponse;
import com.projeto.spring.usecase.gateway.CidadeGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CidadeDataProvider implements CidadeGateway {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Override
    public Optional<List<CidadeDomainResponse>> listarCidadePorNome(String nome) {
        return cidadeRepository.findByNomeIgnoreCase(nome).map(CidadeDataProviderMapper::toCidadeDomain);
    }
    @Override
    public Optional<List<CidadeDomainResponse>> listarCidadePorEstado(String estado) {
        return cidadeRepository.findByEstadoIgnoreCase(estado).map(CidadeDataProviderMapper::toCidadeDomain);
    }
}
