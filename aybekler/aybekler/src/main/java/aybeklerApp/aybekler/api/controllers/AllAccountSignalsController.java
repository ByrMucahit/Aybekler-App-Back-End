package aybeklerApp.aybekler.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aybeklerApp.aybekler.business.abstracts.AllAccountSignalsService;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.entities.concretes.AllAccountSignals;
import aybeklerApp.aybekler.entities.concretes.Muco;

@RestController
@RequestMapping("/api/allaccountsignals")
public class AllAccountSignalsController {
	
	private AllAccountSignalsService allAccountSignalsService;
	
	@Autowired
	public AllAccountSignalsController(AllAccountSignalsService allAccountSignalsService) {
		super();
		this.allAccountSignalsService = allAccountSignalsService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<AllAccountSignals>> getAll() {
		return this.allAccountSignalsService.getAll();
	}
}
