package it.prova.catenadimontaggio.dao.automobile;

import it.prova.catenadimontaggio.dao.DbMock;
import it.prova.catenadimontaggio.model.Automobile;

public class AutomobileDAOImpl implements AutomobileDAO {

	@Override
	public void insert(Automobile input) {

		DbMock.SLOTS_CATENA_MONTAGGIO.stream().filter(slots -> slots.getId() == input.getCatenaDiMontaggio().getId())
				.map(slots -> slots.getAutomobili().add(input));
	}

}
