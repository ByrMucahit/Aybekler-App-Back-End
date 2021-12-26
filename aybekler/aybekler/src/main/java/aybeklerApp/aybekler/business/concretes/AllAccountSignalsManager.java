package aybeklerApp.aybekler.business.concretes;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aybeklerApp.aybekler.business.abstracts.AllAccountSignalsService;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;
import aybeklerApp.aybekler.core.utilities.results.SuccessDataResult;
import aybeklerApp.aybekler.core.utilities.results.SuccessResult;
import aybeklerApp.aybekler.dataAccess.abstracts.dao.AllAccountSignalsDao;
import aybeklerApp.aybekler.dataAccess.abstracts.dto.AllAccountSignalsByDto;
import aybeklerApp.aybekler.entities.concretes.AllAccountSignals;
import aybeklerApp.aybekler.entities.concretes.Muco;
import aybeklerApp.aybekler.entities.dtos.AllAccountSignalsDto;

@Service
public class AllAccountSignalsManager implements AllAccountSignalsService {
	
	private AllAccountSignalsDao allAccountSignalsDao;
	private AllAccountSignalsByDto allAccountSignalDto;
	
	@Autowired
	public AllAccountSignalsManager(AllAccountSignalsDao allAccountSignalsDao, AllAccountSignalsByDto allAccountSignalDto) {
		super();
		this.allAccountSignalsDao = allAccountSignalsDao;
		this.allAccountSignalDto = allAccountSignalDto;
	}

	@Override
	public DataResult<List<AllAccountSignalsDto>> getAll() {
		return new SuccessDataResult<List<AllAccountSignalsDto>>
			(this.allAccountSignalDto.findAll(), "Data has been listed");
	}

	@Override
	public Result insertInto(AllAccountSignals allAccountSignals) {
		this.allAccountSignalsDao.save(allAccountSignals);
		return new SuccessResult("Product has been added");
	}

	@Override
	public DataResult<List<AllAccountSignalsDto>> printAsExcell() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<AllAccountSignalsDto>> getDataByRegion(String region) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<AllAccountSignalsDto>>
		 (this.allAccountSignalDto.getDataByRegion(region),"Data has been listed");
	}

	@Override
	public DataResult<List<AllAccountSignalsDto>> getDataByOccupation(String occupation) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<AllAccountSignalsDto>>
		(this.allAccountSignalDto.getDataByOccupation(occupation));
	}

	@Override
	public DataResult<List<AllAccountSignalsDto>> getDataByPeriod(String period) {
		
		return new SuccessDataResult<List<AllAccountSignalsDto>>
		(this.allAccountSignalDto.getDataByPeriod(period));
	}

	@Override
	public DataResult<List<AllAccountSignalsDto>> getDataByDates(Date dates) {
		return new SuccessDataResult<List<AllAccountSignalsDto>>
		(this.allAccountSignalDto.getDataByDates(dates), "Data has been listed on date.");
	}

	@Override
	public DataResult<List<AllAccountSignalsDto>> getDataByTimes(Time times) {
		return new SuccessDataResult<List<AllAccountSignalsDto>>
		(this.allAccountSignalDto.getDataByTimes(times),"Data has been listed on times");
	}

	

	/*@Override
	public DataResult<List<AllAccountSignals>> getDataByHour(String hour) {
		return new SuccessDataResult<List<AllAccountSignals>>
		(this.allAccountSignalsDao.getDataByHour(hour),"Data has been listed on hour");
	}

	@Override
	public DataResult<List<AllAccountSignals>> getDataByIntervalHour(String start, String finish) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<AllAccountSignals>>
		(this.allAccountSignalsDao.getDataByIntervalHour(start, finish));
	}*/

}
