package com.coursjpa.coursjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursjpa.coursjpa.entities.Planification;

public interface PlanificationRepository extends JpaRepository<Planification, Long> {

}