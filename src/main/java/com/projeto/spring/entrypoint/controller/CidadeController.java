package com.projeto.spring.entrypoint.controller;


import com.projeto.spring.entrypoint.mapper.CidadeEntryPointModelMapper;
import com.projeto.spring.entrypoint.model.response.CidadeModelResponse;
import com.projeto.spring.usecase.domain.response.CidadeDomainResponse;
import com.projeto.spring.usecase.service.CidadeUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cidade")
public class CidadeController {

    @Autowired
    private CidadeUseCase cidadeUseCase;

    @GetMapping(value = "listarpor/nome/{nome}")
    public ResponseEntity<List<CidadeModelResponse>> listarCidadePorNome(@PathVariable String nome) {
        Optional<List<CidadeDomainResponse>> objResponse =
                cidadeUseCase.listarCidadePorNome(nome);
        return ResponseEntity.ok().body(CidadeEntryPointModelMapper.toCidadeModelResponse(objResponse.get()));
    }

    @GetMapping(value = "listarpor/estado/{estado}")
    public ResponseEntity<List<CidadeModelResponse>> listarCidadePorEstado(@PathVariable String estado) {
        Optional<List<CidadeDomainResponse>> objResponse =
                cidadeUseCase.listarCidadePorEstado(estado);
        return ResponseEntity.ok().body(CidadeEntryPointModelMapper.toCidadeModelResponse(objResponse.get()));
    }

}
