package com.projeto.spring.datarpovider.mapper;

import com.projeto.spring.datarpovider.entities.ClienteEntity;
import com.projeto.spring.usecase.domain.request.ClienteDomainRequest;
import com.projeto.spring.usecase.domain.response.ClienteDomainResponse;

import java.util.ArrayList;
import java.util.List;

public class ClienteDataProviderMapper {

    public static List<ClienteDomainResponse> toClienteDomain(List<ClienteEntity> listaDeClientes){
        List<ClienteDomainResponse> clienteDomainResponseList = new ArrayList<>();
        for (ClienteEntity cliente : listaDeClientes){
            clienteDomainResponseList.add(
                    new ClienteDomainResponse(
                            cliente.getId(),
                            cliente.getNomeCompleto(),
                            cliente.getSexo(),
                            cliente.getNascimento(),
                            cliente.getIdade(),
                            cliente.getCidade()
                        )
            );
        }
        return clienteDomainResponseList;
    }

    public static ClienteEntity toClienteEntity(ClienteDomainRequest cliente){
        ClienteEntity clienteEntity = new ClienteEntity(
                null,
                cliente.getNomeCompleto(),
                cliente.getSexo(),
                cliente.getNascimento(),
                cliente.getIdade(),
                cliente.getCidade()
        );
        return clienteEntity;
    }

}
