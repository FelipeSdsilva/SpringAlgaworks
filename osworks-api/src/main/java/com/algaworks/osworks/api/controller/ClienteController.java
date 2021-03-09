package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import com.algaworks.osworks.domain.model.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    @GetMapping("/clientes")
    public List<Cliente> Listar()
    {
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Felipe Sousa");
        cliente1.setTelefone("(11)95470-5118");
        cliente1.setEmail("Felipe.fps09@hotmail.com");
        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Fulaninho Sousa");
        cliente2.setTelefone("(11)2333-4455");
        cliente2.setEmail("Fulaninho@gmail.com");
        return Arrays.asList(cliente1,cliente2);
    }
}
