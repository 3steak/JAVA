package com.coursjpa.coursjpa;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.coursjpa.coursjpa.entities.Client;
import com.coursjpa.coursjpa.entities.Conseiller;
import com.coursjpa.coursjpa.entities.EtatPlanification;
import com.coursjpa.coursjpa.entities.Planification;
import com.coursjpa.coursjpa.entities.RDV;
import com.coursjpa.coursjpa.services.BankService;

@SpringBootApplication
public class CoursjpaApplication {

	public static void main(String[] args) {
		System.out.println("Lancement du main");
		SpringApplication.run(CoursjpaApplication.class, args);
	}

	// Creation jeu de données
	@Bean
	CommandLineRunner start(
			BankService banBankService) {
		return args -> {
			System.out.println("$$$$$$ Dans le start $$$$$$$$$");

			Client c1 = new Client();
			c1.setPrenom("Jean");
			c1.setNom("Bon");
			c1.setEmail("jean.bon@gmail.com");
			banBankService.saveClient(c1);
			// Conseiller
			Conseiller cons1 = new Conseiller();
			cons1.setPrenom("Albert");
			cons1.setNom("Eich");
			cons1.setEmail("albert@live.fr");
			banBankService.saveConseiller(cons1);
			// Planification
			Planification p1 = new Planification();
			p1.setClient(c1);
			p1.setConseiller(cons1);
			p1.setDate(new Date());
			p1.setEtatPlanification(EtatPlanification.EN_COURS);
			banBankService.savePlanification(p1);
			// RDV
			RDV r1 = new RDV();
			r1.setDateRdv(p1.getDate());
			r1.setPlanification(p1);
			r1.setRapport("oui");
			banBankService.saveRdv(r1);
		};
	}
}
