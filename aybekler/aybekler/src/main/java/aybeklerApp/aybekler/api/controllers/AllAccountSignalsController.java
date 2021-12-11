package aybeklerApp.aybekler.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aybeklerApp.aybekler.entities.concretes.AllAccountSignals;

@RestController
@RequestMapping("/api/allaccountsignals")
public class AllAccountSignalsController {
	
	@Autowired
	public AllAccountSignalsController() {
		super();
		
	}
	
	@GetMapping("/getall")
	public void getAll() {
		System.out.println("It's working");
	}
}
