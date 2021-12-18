package aybeklerApp.aybekler.business.concretes;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aybeklerApp.aybekler.business.abstracts.AllAccountSignalsService;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;
import aybeklerApp.aybekler.core.utilities.results.SuccessDataResult;
import aybeklerApp.aybekler.core.utilities.results.SuccessResult;
import aybeklerApp.aybekler.dataAccess.abstracts.AllAccountSignalsDao;
import aybeklerApp.aybekler.entities.concretes.AllAccountSignals;
import aybeklerApp.aybekler.entities.concretes.Muco;

@Service
public class AllAccountSignalsManager implements AllAccountSignalsService {
	
	private AllAccountSignalsDao allAccountSignalsDao;
	
	@Autowired
	public AllAccountSignalsManager(AllAccountSignalsDao allAccountSignalsDao) {
		super();
		this.allAccountSignalsDao = allAccountSignalsDao;
	}

	@Override
	public DataResult<List<AllAccountSignals>> getAll() {
		return new SuccessDataResult<List<AllAccountSignals>>
			(this.allAccountSignalsDao.findAll(), "Data has been listed");
	}

	@Override
	public Result insertInto(AllAccountSignals allAccountSignals) {
		this.allAccountSignalsDao.save(allAccountSignals);
		return new SuccessResult("Product has been added");
	}

	@Override
	public DataResult<List<AllAccountSignals>> printAsExcell() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<AllAccountSignals>> getDataByRegion(String region) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<AllAccountSignals>>
		 (this.allAccountSignalsDao.getDataByRegion(region),"Data has been listed");
	}

	@Override
	public DataResult<List<AllAccountSignals>> getDataByOccupation(String occupation) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<AllAccountSignals>>
		(this.allAccountSignalsDao.getDataByOccupation(occupation));
	}

	@Override
	public DataResult<List<AllAccountSignals>> getDataByPeriod(String period) {
		
		return new SuccessDataResult<List<AllAccountSignals>>
		(this.allAccountSignalsDao.getDataByPeriod(period));
	}

	@Override
	public DataResult<List<AllAccountSignals>> getDataByDates(LocalDate dates) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<AllAccountSignals>>
		(this.allAccountSignalsDao.getDataByDates(dates), "Data has been listed on date.");
	}

	@Override
	public DataResult<List<AllAccountSignals>> getDataByIntervals(LocalDate dates) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<AllAccountSignals>>
		(this.allAccountSignalsDao.getDataByInterval(dates),"data has been listed");
	}


}
