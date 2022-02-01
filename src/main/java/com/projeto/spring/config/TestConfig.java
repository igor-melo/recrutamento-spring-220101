package com.projeto.spring.config;

import com.projeto.spring.datarpovider.entities.CidadeEntity;
import com.projeto.spring.datarpovider.entities.ClienteEntity;
import com.projeto.spring.datarpovider.repository.CidadeRepository;
import com.projeto.spring.datarpovider.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration

public class TestConfig implements CommandLineRunner{

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void run(String... args) throws Exception {
        CidadeEntity city1 = new CidadeEntity(null, "Recife", "Pernambuco");
        CidadeEntity city2 = new CidadeEntity(null, "Olinda", "Pernambuco");
        CidadeEntity city3 = new CidadeEntity(null, "João Pessoa", "Paraiba");
        cidadeRepository.saveAll(Arrays.asList(city1, city2, city3));

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));


        ClienteEntity client1 = new ClienteEntity(null, "Igor", 'M', sdf.parse("02/03/2018"), 12, "Recife");
        ClienteEntity client2 = new ClienteEntity(null, "Melo", 'F', sdf.parse("02/03/2018"), 13, "Recife");
        clienteRepository.saveAll(Arrays.asList(client1, client2));

    }
}
