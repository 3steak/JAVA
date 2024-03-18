package com.coursjpa.coursjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursjpa.coursjpa.entities.Compte;

public interface TypeCompteRepository extends JpaRepository<Compte, Long> {

}