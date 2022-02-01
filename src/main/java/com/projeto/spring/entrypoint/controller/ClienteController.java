package com.projeto.spring.entrypoint.controller;


import com.projeto.spring.entrypoint.mapper.ClienteEntryPointDomainMapper;
import com.projeto.spring.entrypoint.mapper.ClienteEntryPointModelMapper;
import com.projeto.spring.entrypoint.model.request.ClienteModelRequest;
import com.projeto.spring.entrypoint.model.response.ClienteModelResponse;
import com.projeto.spring.usecase.domain.response.ClienteDomainResponse;
import com.projeto.spring.usecase.service.ClienteUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteUseCase clienteUseCase;

    @GetMapping(value = "listarpor/nome/{nome}")
    public ResponseEntity<List<ClienteModelResponse>> listarClientePorNome(@PathVariable String nome) {
        Optional<List<ClienteDomainResponse>> objResponse = clienteUseCase.listarClientePorNome(nome);
        return ResponseEntity.ok().body(ClienteEntryPointModelMapper.toClienteModelResponse(objResponse.get()));
    }

    @GetMapping(value = "listarpor/id/{id}")
    public ResponseEntity<List<ClienteModelResponse>> listarClientePorNome(@PathVariable Long id) {
        List<ClienteDomainResponse> objResponse = Arrays.asList(clienteUseCase.listarClientePorId(id));
        return ResponseEntity.ok().body(ClienteEntryPointModelMapper.toClienteModelResponse(objResponse));

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        clienteUseCase.deleteCliente(id);
        return  ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@RequestBody ClienteModelRequest cliente, @PathVariable Long id) {
        clienteUseCase.salvarCliente(ClienteEntryPointDomainMapper.toDomain(cliente), id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<Void> inserir(@RequestBody ClienteModelRequest cliente) {
        clienteUseCase.inserirCliente(ClienteEntryPointDomainMapper.toDomain(cliente));
        return ResponseEntity.noContent().build();
    }

}
