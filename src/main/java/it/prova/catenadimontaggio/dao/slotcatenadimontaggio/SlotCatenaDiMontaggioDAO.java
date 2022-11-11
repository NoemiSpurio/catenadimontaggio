package it.prova.catenadimontaggio.dao.slotcatenadimontaggio;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public interface SlotCatenaDiMontaggioDAO {

	public SlotCatenaDiMontaggio get(Long id);

	public void addAutomobileToSlot(SlotCatenaDiMontaggio slotInput, Automobile automobileInput);
}
