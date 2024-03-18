package com.coursjpa.coursjpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursjpa.coursjpa.entities.Client;
import com.coursjpa.coursjpa.entities.Conseiller;
import com.coursjpa.coursjpa.entities.Planification;
import com.coursjpa.coursjpa.entities.RDV;
import com.coursjpa.coursjpa.repositories.ClientRepository;
import com.coursjpa.coursjpa.repositories.ConseillerRepository;
import com.coursjpa.coursjpa.repositories.PlanificationRepository;
import com.coursjpa.coursjpa.repositories.RDVRepository;

/**
 * BankServiceImplementation
 */
@Service
public class BankServiceImplementation implements BankService {
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    ConseillerRepository conseillerRepository;
    @Autowired
    PlanificationRepository planificationRepository;
    @Autowired
    RDVRepository rdvRepository;

    @Override
    public Client saveClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Conseiller saveConseiller(Conseiller c) {
        return conseillerRepository.save(c);
    }

    @Override
    public Planification savePlanification(Planification p) {
        return planificationRepository.save(p);
    }

    @Override
    public RDV saveRdv(RDV rdv) {
        return rdvRepository.save(rdv);

    }

}