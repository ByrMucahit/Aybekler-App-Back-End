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

import aybeklerApp.aybekler.business.abstracts.FooterTableSignalsSystemUserService;
import aybeklerApp.aybekler.entities.concretes.CustomerCard;
import aybeklerApp.aybekler.entities.concretes.FooterTableSignalsSystemUser;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;
@RestController
@RequestMapping("/api/footerTableSignalsSystemUser")
public class FooterTableSignalsSystemUserController {

	private FooterTableSignalsSystemUserService footerTableSignalsSystemUserService;
	
	@Autowired
	public FooterTableSignalsSystemUserController(FooterTableSignalsSystemUserService footerTableSignalsSystemUserService) {
		this.footerTableSignalsSystemUserService = footerTableSignalsSystemUserService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<FooterTableSignalsSystemUser>> getAllData(){
		return footerTableSignalsSystemUserService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody FooterTableSignalsSystemUser footerTableSignalsSystemUser) {
		return this.footerTableSignalsSystemUserService.insertInto(footerTableSignalsSystemUser);
	}
	
	@PutMapping("/edit")
	public Result update(@RequestBody FooterTableSignalsSystemUser footerTableSignalsSystemUser,@RequestParam int idOfAccount) {
		
		return this.footerTableSignalsSystemUserService.update(footerTableSignalsSystemUser,idOfAccount);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestParam int idOfAccount) {
		return this.footerTableSignalsSystemUserService.deleteById(idOfAccount);
	}
}
