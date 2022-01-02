package aybeklerApp.aybekler.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;
import aybeklerApp.aybekler.entities.concretes.FooterTableGivingNewsToPerson;
import aybeklerApp.aybekler.business.abstracts.FooterTableGivingNewsToPersonService;

@RestController()
@RequestMapping("/api/FooterTableGivingNewsToPersonController")
public class FooterTableGivingNewsToPersonController {
	
	private FooterTableGivingNewsToPersonService footerTableGivingNewsToPersonService;
	
	@Autowired
	public FooterTableGivingNewsToPersonController(FooterTableGivingNewsToPersonService footerTableGivingNewsToPersonService) {
		this.footerTableGivingNewsToPersonService = footerTableGivingNewsToPersonService; 
	}
	
	@GetMapping("/getAll")
	public DataResult<List<FooterTableGivingNewsToPerson>> getAll(){
		return this.footerTableGivingNewsToPersonService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody FooterTableGivingNewsToPerson footerTableGivingNewsToPerson) {
		return this.footerTableGivingNewsToPersonService.insertInto(footerTableGivingNewsToPerson);
	}
	
	@PutMapping("/edit")
	public Result edit(@RequestBody FooterTableGivingNewsToPerson footerTableGivingNewsToPerson, @RequestParam int idOfAccount) {
		return this.footerTableGivingNewsToPersonService.update(idOfAccount, footerTableGivingNewsToPerson);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestParam int idOfAccount) {
		return this.footerTableGivingNewsToPersonService.delete(idOfAccount);
	}
}
