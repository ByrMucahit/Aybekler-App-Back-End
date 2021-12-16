package aybeklerApp.aybekler.business.concretes;

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
		return new SuccessResult("Product has been listed");
	}

	@Override
	public DataResult<List<AllAccountSignals>> printAsExcell() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<AllAccountSignals>> getDataByLocationOrUser(String locationOrUser) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<AllAccountSignals>>
		 (this.allAccountSignalsDao.getDataByRegion(locationOrUser),"Data has been listed");
	}

	@Override
	public DataResult<List<AllAccountSignals>> getDataByOccupation(String occupation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<AllAccountSignals>> getDataByPeriod(String period) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<AllAccountSignals>> getDataByDate(Date dateOfStart, Date dateOfEnd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<AllAccountSignals>> getDataByClock(String hourOfStart, String hourOfFinish) {
		// TODO Auto-generated method stub
		return null;
	}

}
