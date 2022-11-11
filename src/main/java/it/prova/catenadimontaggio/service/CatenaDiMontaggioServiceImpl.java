package it.prova.catenadimontaggio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.dao.slotcatenadimontaggio.SlotCatenaDiMontaggioDAO;
import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Service
public class CatenaDiMontaggioServiceImpl implements CatenaDiMontaggioService {

	@Autowired
	private CarrozzeriaService carrozzeriaService;
	@Autowired
	private ImpiantoElettricoService impiantoElettricoService;
	@Autowired
	private MotoreService motoreService;
	@Autowired
	private ProvaSuStradaService provaSuStradaService;
	@Autowired
	private TelaioService telaioService;
	@Autowired
	private SlotCatenaDiMontaggioDAO slotCatenaDiMontaggioDAO;
	
	@Override
	public SlotCatenaDiMontaggio caricaCatenaMontaggio(Long idInput) {
		return slotCatenaDiMontaggioDAO.get(idInput);
	}

	@Override
	public void aggiungiAutomobileACatenaMontaggio(Automobile automobileInput,
			SlotCatenaDiMontaggio catenaMontaggioInput) {
		slotCatenaDiMontaggioDAO.addAutomobileToSlot(catenaMontaggioInput, automobileInput);
	}

	@Override
	public void avviaCatenaDiMontaggio(SlotCatenaDiMontaggio input) {
		System.out.println("=== INIZIO CATENA DI MONTAGGIO ===");
		for (Automobile automobileItem : input.getAutomobili()) {
			System.out.println("Automobile: " + automobileItem);
			telaioService.getTelaio(automobileItem);
			motoreService.getMotore(automobileItem);
			impiantoElettricoService.getImpiantoElettrico(automobileItem);
			carrozzeriaService.getCarrozzeria(automobileItem);
			provaSuStradaService.provaSuStrada(automobileItem);
			System.out.println("************************");
		}
		System.out.println("=== FINE CATENA DI MONTAGGIO ===");
	}

}
