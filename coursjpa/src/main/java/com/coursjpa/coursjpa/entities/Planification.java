package com.coursjpa.coursjpa.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Planification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @Enumerated(EnumType.STRING)
    private EtatPlanification etatPlanification;
    @ManyToOne
    @JsonIgnore
    private Client client;
    @ManyToOne
    @JsonIgnore
    private Conseiller conseiller;
    @OneToOne(mappedBy = "planification")
    private RDV rdv;
}
