package com.coursjpa.coursjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursjpa.coursjpa.entities.Compte;

// JPAREPOSITORY sert de CRUD par defaut il prend les id 

public interface CompteRepository extends JpaRepository<Compte, Long> {

}