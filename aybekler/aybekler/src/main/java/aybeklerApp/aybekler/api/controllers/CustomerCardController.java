package aybeklerApp.aybekler.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import aybeklerApp.aybekler.entities.concretes.CustomerCard;
import aybeklerApp.aybekler.business.abstracts.CustomerCardService;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;


@RestController
@RequestMapping("/api/customerCardController")
public class CustomerCardController {
	
	
	private CustomerCardService customerCardService;
	
	
	@Autowired
	public CustomerCardController(CustomerCardService customerCardServices) {
		super();
		this.customerCardService = customerCardServices;
		
	}
	
	
	@GetMapping("/getAll")
	public DataResult<List<CustomerCard>> getAllData(){	
		return this.customerCardService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CustomerCard customerCard) {
		return this.customerCardService.insertInto(customerCard);
	}
	
	@PutMapping("/updated")
	public Result update(@RequestBody CustomerCard customerCard) {
		return this.customerCardService.update(customerCard);
	}
	
}
