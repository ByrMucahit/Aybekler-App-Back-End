package aybeklerApp.aybekler.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aybeklerApp.aybekler.business.abstracts.FooterTableSignalsSystemUserService;
import aybeklerApp.aybekler.entities.concretes.FooterTableSignalsSystemUser;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
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
}
