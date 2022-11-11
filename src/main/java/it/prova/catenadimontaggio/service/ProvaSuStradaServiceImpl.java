package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class ProvaSuStradaServiceImpl implements ProvaSuStradaService {

	@Override
	public void provaSuStrada(Automobile input) {
		System.out.println("Abbiamo effettuato la prova su strada di: " + input);
	}

}
