package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class ImpiantoElettricoServiceImpl implements ImpiantoElettricoService {

	@Override
	public void getImpiantoElettrico(Automobile input) {
		System.out.println("Ecco l'impianto elettrico di: " + input);
	}

}
