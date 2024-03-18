package com.coursjpa.coursjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.coursjpa.coursjpa.entities.Client;

@RepositoryRestResource

// JPAREPOSITORY sert de CRUD par defaut il prend les id
// ici on redefini pour avoir select par mail
public interface ClientRepository extends JpaRepository<Client, Long> {
    // READ DU CRUD PAR JPA
    Client findByEmail(String email);
}