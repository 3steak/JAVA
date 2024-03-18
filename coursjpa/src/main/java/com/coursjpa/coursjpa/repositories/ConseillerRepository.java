package com.coursjpa.coursjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursjpa.coursjpa.entities.Conseiller;

// JPAREPOSITORY sert de CRUD par defaut il prend les id 
// ici on redefini pour avoir select par mail
public interface ConseillerRepository extends JpaRepository<Conseiller, Long> {

}