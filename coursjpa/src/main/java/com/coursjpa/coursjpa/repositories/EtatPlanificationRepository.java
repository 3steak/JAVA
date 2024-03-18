package com.coursjpa.coursjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursjpa.coursjpa.entities.RDV;

public interface EtatPlanificationRepository extends JpaRepository<RDV, Long> {

}