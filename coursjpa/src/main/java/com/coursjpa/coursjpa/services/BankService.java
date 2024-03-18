package com.coursjpa.coursjpa.services;

import com.coursjpa.coursjpa.entities.Client;
import com.coursjpa.coursjpa.entities.Conseiller;
import com.coursjpa.coursjpa.entities.Planification;
import com.coursjpa.coursjpa.entities.RDV;

/**
 * BankService
 */
public interface BankService {
    Client saveClient(Client c);

    Conseiller saveConseiller(Conseiller c);

    Planification savePlanification(Planification p);

    RDV saveRdv(RDV rdv);
}
