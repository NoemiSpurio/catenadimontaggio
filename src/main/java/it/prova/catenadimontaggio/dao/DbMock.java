package it.prova.catenadimontaggio.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public class DbMock {

	public static final List<SlotCatenaDiMontaggio> SLOTS_CATENA_MONTAGGIO = new ArrayList<SlotCatenaDiMontaggio>();

	static {
		SlotCatenaDiMontaggio slot1 = new SlotCatenaDiMontaggio(1L, "Toyota", "Giappone", new ArrayList<Automobile>());
		Automobile toyota1 = new Automobile(1L, "Yaris", "Blu", new Date());
		slot1.getAutomobili().add(toyota1);
		Automobile toyota2 = new Automobile(2L, "Aygo", "Rosso", new Date());
		slot1.getAutomobili().add(toyota2);
		SlotCatenaDiMontaggio slot2 = new SlotCatenaDiMontaggio(2L, "Honda", "Giappone", new ArrayList<Automobile>());
		Automobile honda1 = new Automobile(3L, "Civic", "Nero", new Date());
		slot2.getAutomobili().add(honda1);
		Automobile honda2 = new Automobile(4L, "Jazz", "Arancio", new Date());
		slot2.getAutomobili().add(honda2);
		SlotCatenaDiMontaggio slot3 = new SlotCatenaDiMontaggio(3L, "Fiat", "Italia", new ArrayList<Automobile>());
		Automobile fiat1 = new Automobile(5L, "Panda", "Bianco", new Date());
		slot3.getAutomobili().add(fiat1);
		Automobile fiat2 = new Automobile(6L, "Pandino", "Rosa", new Date());
		slot3.getAutomobili().add(fiat2);

		SLOTS_CATENA_MONTAGGIO.add(slot1);
		SLOTS_CATENA_MONTAGGIO.add(slot2);
		SLOTS_CATENA_MONTAGGIO.add(slot3);
	}

}
