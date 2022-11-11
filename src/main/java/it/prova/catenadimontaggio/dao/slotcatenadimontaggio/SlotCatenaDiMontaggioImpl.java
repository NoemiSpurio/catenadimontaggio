package it.prova.catenadimontaggio.dao.slotcatenadimontaggio;

import java.util.stream.Collectors;

import it.prova.catenadimontaggio.dao.DbMock;
import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public class SlotCatenaDiMontaggioImpl implements SlotCatenaDiMontaggioDAO {

	@Override
	public SlotCatenaDiMontaggio get(Long id) {
		return DbMock.SLOTS_CATENA_MONTAGGIO.stream().filter(slots -> slots.getId() == id).findAny().orElse(null);
	}

	@Override
	public void addAutomobileToSlot(SlotCatenaDiMontaggio slotInput, Automobile automobileInput) {
		DbMock.SLOTS_CATENA_MONTAGGIO.stream().filter(slots -> slots.getId() == slotInput.getId())
				.map(slots -> slots.getAutomobili().add(automobileInput));
	}

}
