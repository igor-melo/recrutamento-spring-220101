package com.projeto.spring.entrypoint.mapper;

import com.projeto.spring.entrypoint.model.request.ClienteModelRequest;
import com.projeto.spring.usecase.domain.request.ClienteDomainRequest;

public class ClienteEntryPointDomainMapper {

    private ClienteEntryPointDomainMapper() {
    }

    public static ClienteDomainRequest toDomain(ClienteModelRequest cliente){
        return new ClienteDomainRequest(
                cliente.getNomeCompleto(),
                cliente.getSexo(),
                cliente.getNascimento(),
                cliente.getIdade(),
                cliente.getCidade()
        );
    }
}
