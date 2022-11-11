package it.prova.catenadimontaggio;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;
import it.prova.catenadimontaggio.service.CatenaDiMontaggioService;

@SpringBootApplication
public class CatenadimontaggioApplication implements CommandLineRunner{

	@Autowired
	private CatenaDiMontaggioService catenaDiMontaggioService;
	
	public static void main(String[] args) {
		SpringApplication.run(CatenadimontaggioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		SlotCatenaDiMontaggio slot1 = catenaDiMontaggioService.caricaCatenaMontaggio(1L);
		
		Automobile autoNew = new Automobile(10L, "Miao","Miao", new Date());
		autoNew.setCatenaDiMontaggio(slot1);
		
		catenaDiMontaggioService.aggiungiAutomobileACatenaMontaggio(autoNew, slot1);
		
		catenaDiMontaggioService.avviaCatenaDiMontaggio(slot1);
	}

}
