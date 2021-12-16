package aybeklerApp.aybekler.business.abstracts;
import aybeklerApp.aybekler.entities.concretes.AllAccountSignals;
import aybeklerApp.aybekler.entities.concretes.Muco;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;

import java.util.Date;
import java.util.List;

public interface AllAccountSignalsService {
	DataResult<List<AllAccountSignals>> getAll();
	Result insertInto(AllAccountSignals allAccountSignals);
	DataResult<List<AllAccountSignals>> printAsExcell();
	DataResult<List<AllAccountSignals>> getDataByRegion(String region);
	DataResult<List<AllAccountSignals>> getDataByOccupation(String occupation);
	DataResult<List<AllAccountSignals>> getDataByPeriod(String period);
	DataResult<List<AllAccountSignals>> getDataByDate(Date dateOfStart, Date dateOfEnd);
	}
