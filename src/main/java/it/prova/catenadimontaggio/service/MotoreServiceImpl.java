package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class MotoreServiceImpl implements MotoreService {

	@Override
	public void getMotore(Automobile input) {
		System.out.println("Ecco il motore di: " + input);
	}

}
