package it.prova.catenadimontaggio.dao.slotcatenadimontaggio;

import org.springframework.stereotype.Component;

import it.prova.catenadimontaggio.dao.DbMock;
import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Component
public class SlotCatenaDiMontaggioDAOImpl implements SlotCatenaDiMontaggioDAO {

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
