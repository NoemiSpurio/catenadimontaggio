package it.prova.catenadimontaggio.service;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public interface CatenaDiMontaggioService {

	public SlotCatenaDiMontaggio caricaCatenaMontaggio(Long idInput);

	public void aggiungiAutomobileACatenaMontaggio(Automobile automobileInput,
			SlotCatenaDiMontaggio catenaMontaggioInput);

	public void avviaCatenaDiMontaggio(SlotCatenaDiMontaggio input);
}
