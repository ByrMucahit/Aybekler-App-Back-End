package aybeklerApp.aybekler.business.abstracts;
import aybeklerApp.aybekler.entities.concretes.AllAccountSignals;
import aybeklerApp.aybekler.entities.concretes.Muco;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface AllAccountSignalsService {
	DataResult<List<AllAccountSignals>> getAll();
	Result insertInto(AllAccountSignals allAccountSignals);
	DataResult<List<AllAccountSignals>> printAsExcell();
	DataResult<List<AllAccountSignals>> getDataByRegion(String region);
	DataResult<List<AllAccountSignals>> getDataByOccupation(String occupation);
	DataResult<List<AllAccountSignals>> getDataByPeriod(String period);
	DataResult<List<AllAccountSignals>> getDataByDates(Timestamp dates);
	/*DataResult<List<AllAccountSignals>> getDataByHour(String hour);
	DataResult<List<AllAccountSignals>> getDataByIntervalHour(String start, String finish);*/
	}
