package com.coursjpa.coursjpa.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.coursjpa.coursjpa.entities.Client;
import com.coursjpa.coursjpa.repositories.ClientRepository;
import com.coursjpa.coursjpa.services.BankService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class ClientRestController {
    private ClientRepository clientRepository;
    private BankService bankService;

    public ClientRestController(ClientRepository clientRepository, BankService bankService) {
        this.clientRepository = clientRepository;
        this.bankService = bankService; // Injection de dépendance
    }

    @GetMapping(path = "/clients/all")
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    // Peu ne rien retourner (.get())
    @GetMapping(path = "/clients/{id}")
    public Client getById(@PathVariable(name = "id") Long id) {
        return clientRepository.findById(id).get();
    }

    // CREATE

    @PostMapping(path = "/clients/add")
    public Client saveClient(@RequestBody Client client) {
        return bankService.saveClient(client);
    }

    // UPDATE
    @PutMapping("clients/{id}")
    public Client updateClient(@PathVariable(name = "id") Long id, @RequestBody Client client) {
        client.setId(id);
        return bankService.saveClient(client);
    }

}
