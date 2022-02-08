package com.projeto.spring.datarpovider.mapper;

import com.projeto.spring.datarpovider.entities.CidadeEntity;
import com.projeto.spring.datarpovider.entities.ClienteEntity;
import com.projeto.spring.usecase.domain.request.CidadeDomainRequest;
import com.projeto.spring.usecase.domain.response.CidadeDomainResponse;

import java.util.ArrayList;
import java.util.List;

public class CidadeDataProviderMapper {

    public static List<CidadeDomainResponse> toCidadeDomain(List<CidadeEntity> listaDeCidades){
        List<CidadeDomainResponse> cidadeDomainResponseList = new ArrayList<>();
        for (CidadeEntity cidade : listaDeCidades){
            cidadeDomainResponseList.add(
                    new CidadeDomainResponse(
                            cidade.getId(),
                            cidade.getNome(),
                            cidade.getEstado()));
        }
        return cidadeDomainResponseList;
    }

    public static CidadeEntity toCidadeEntity(CidadeDomainRequest cidade) {
            CidadeEntity cidadeEntity = new CidadeEntity(
                    cidade.getNome(),
                    cidade.getEstado()
            );
            return cidadeEntity;
        
    }
}
