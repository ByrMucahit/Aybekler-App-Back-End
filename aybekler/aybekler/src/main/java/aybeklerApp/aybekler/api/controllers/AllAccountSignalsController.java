package aybeklerApp.aybekler.api.controllers;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
import aybeklerApp.aybekler.entities.dtos.AllAccountSignalsDto;

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
	public DataResult<List<AllAccountSignalsDto>> getAll() {
		return this.allAccountSignalsService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody AllAccountSignals allAccountSignals) {
		return this.allAccountSignalsService.insertInto(allAccountSignals);
	}
	
	@GetMapping("/getAllByRegion")
	public DataResult<List<AllAccountSignalsDto>> getDataByRegion(@RequestParam("region") String region){
		return this.allAccountSignalsService.getDataByRegion(region);
	}
	
	@GetMapping("/getAllByOccupation")
	public DataResult<List<AllAccountSignalsDto>> getDataByOccupation(@RequestParam("occupation") String occupation){
		return this.allAccountSignalsService.getDataByOccupation(occupation);
	}
	
	@GetMapping("/getAllByPeriod")
	public DataResult<List<AllAccountSignalsDto>> getDataByPeriod(@RequestParam("period") String period){
		return this.allAccountSignalsService.getDataByPeriod(period);
	}
	
	@GetMapping("/getAllByDates")
	public DataResult<List<AllAccountSignalsDto>> getDataByDates(@RequestParam("dates") Date dates){
		return this.allAccountSignalsService.getDataByDates(dates);
	}
	
	@GetMapping("getAllByTimes")
	public DataResult<List<AllAccountSignalsDto>> getDataByTimes(@RequestParam("times") Time times){
		return this.allAccountSignalsService.getDataByTimes(times);
	}
	
	/*@GetMapping("/getAllByHour")
	public DataResult<List<AllAccountSignals>> getDataByHour(String hour) {
		return this.allAccountSignalsService.getDataByHour(hour);
	}
	
	@GetMapping("/getAllByIntervalHour")
	public DataResult<List<AllAccountSignals>> getDataByIntervalHour(String start, String finish){
		return this.allAccountSignalsService.getDataByIntervalHour(start, finish);
	}*/
}
