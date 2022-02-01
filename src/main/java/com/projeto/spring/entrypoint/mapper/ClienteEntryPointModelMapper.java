package com.projeto.spring.entrypoint.mapper;

import com.projeto.spring.entrypoint.model.response.ClienteModelResponse;
import com.projeto.spring.usecase.domain.response.ClienteDomainResponse;

import java.util.ArrayList;
import java.util.List;

public class ClienteEntryPointModelMapper {

    public static List<ClienteModelResponse> toClienteModelResponse(List<ClienteDomainResponse> clienteDomainResponseList){

        List<ClienteModelResponse> clienteModelResponseList = new ArrayList<>();
        for (ClienteDomainResponse cliente : clienteDomainResponseList){
            clienteModelResponseList.add(
                    new ClienteModelResponse(
                            cliente.getId(),
                            cliente.getNomeCompleto(),
                            cliente.getSexo(),
                            cliente.getNascimento(),
                            cliente.getIdade(),
                            cliente.getCidade()
                    )
            );
        }
        return clienteModelResponseList;


    }


}
