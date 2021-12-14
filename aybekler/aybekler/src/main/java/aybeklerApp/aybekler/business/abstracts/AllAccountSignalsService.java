package aybeklerApp.aybekler.business.abstracts;
import aybeklerApp.aybekler.entities.concretes.AllAccountSignals;
import aybeklerApp.aybekler.entities.concretes.Muco;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;

import java.util.List;

public interface AllAccountSignalsService {
	DataResult<List<AllAccountSignals>> getAll();
	Result insertInto(AllAccountSignals allAccountSignals);
	DataResult<List<AllAccountSignals>> printAsExcell();
	DataResult<List<AllAccountSignals>> getDataByRegion();
	DataResult<List<AllAccountSignals>> getDataByOccupation();
	DataResult<List<AllAccountSignals>> getDataByPeriod();
	DataResult<List<AllAccountSignals>> getDataByDate();
	DataResult<List<AllAccountSignals>> getDataByClock();
	}
