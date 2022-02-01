package com.projeto.spring.entrypoint.mapper;

import com.projeto.spring.entrypoint.model.response.CidadeModelResponse;
import com.projeto.spring.usecase.domain.response.CidadeDomainResponse;

import java.util.ArrayList;
import java.util.List;

public class CidadeEntryPointModelMapper {

    public static List<CidadeModelResponse> toCidadeModelResponse(List<CidadeDomainResponse> cidadeDomainResponseList){

        List<CidadeModelResponse> cidadeModelResponseList = new ArrayList<>();
        for (CidadeDomainResponse cidade : cidadeDomainResponseList){
            cidadeModelResponseList.add(
                    new CidadeModelResponse(
                            cidade.getId(),
                            cidade.getNome(),
                            cidade.getEstado()));
        }
        return cidadeModelResponseList;
    }
}
