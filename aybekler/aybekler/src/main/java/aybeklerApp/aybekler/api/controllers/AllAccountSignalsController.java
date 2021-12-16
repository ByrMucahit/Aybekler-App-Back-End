package aybeklerApp.aybekler.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import aybeklerApp.aybekler.business.abstracts.AllAccountSignalsService;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;
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
	
	@PostMapping("/add")
	public Result add(@RequestBody AllAccountSignals allAccountSignals) {
		return this.allAccountSignalsService.insertInto(allAccountSignals);
	}
	
	@GetMapping("/getAllByRegion")
	public DataResult<List<AllAccountSignals>> getDataByRegion(@RequestParam("region") String region){
		return this.allAccountSignalsService.getDataByLocationOrUser(region);
	}
	
}
