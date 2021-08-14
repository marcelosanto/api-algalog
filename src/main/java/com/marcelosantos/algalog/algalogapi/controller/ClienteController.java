package com.marcelosantos.algalog.algalogapi.controller;

import com.marcelosantos.algalog.algalogapi.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Joséfina");
        cliente1.setEmail("josefina@kaka.com");
        cliente1.setTelefone("27 99929-6999");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Epitafia");
        cliente2.setEmail("epitafia@kaka.com");
        cliente2.setTelefone("27 99929-6999");

        return Arrays.asList(cliente1, cliente2);

    }
}
