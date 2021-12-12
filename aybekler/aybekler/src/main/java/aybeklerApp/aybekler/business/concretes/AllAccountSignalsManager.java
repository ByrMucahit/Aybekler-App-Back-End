package aybeklerApp.aybekler.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aybeklerApp.aybekler.business.abstracts.AllAccountSignalsService;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.SuccessDataResult;
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
		// TODO Auto-generated method stub
		System.out.println("parameters"+this.allAccountSignalsDao.findAll());
		return new SuccessDataResult<List<AllAccountSignals>>
			(this.allAccountSignalsDao.findAll(), "Data has been listed");
	}


}
