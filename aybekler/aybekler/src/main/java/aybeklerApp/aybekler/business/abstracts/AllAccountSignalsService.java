package aybeklerApp.aybekler.business.abstracts;
import aybeklerApp.aybekler.entities.concretes.AllAccountSignals;
import aybeklerApp.aybekler.entities.concretes.Muco;
import aybeklerApp.aybekler.entities.dtos.AllAccountSignalsDto;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface AllAccountSignalsService {
	DataResult<List<AllAccountSignalsDto>> getAll();
	Result insertInto(AllAccountSignals allAccountSignals);
	DataResult<List<AllAccountSignalsDto>> printAsExcell();
	DataResult<List<AllAccountSignalsDto>> getDataByRegion(String region);
	DataResult<List<AllAccountSignalsDto>> getDataByOccupation(String occupation);
	DataResult<List<AllAccountSignalsDto>> getDataByPeriod(String period);
	DataResult<List<AllAccountSignalsDto>> getDataByDates(String dates);
	DataResult<List<AllAccountSignalsDto>> getDataByTimes(String times);
	/*DataResult<List<AllAccountSignals>> getDataByHour(String hour);
	DataResult<List<AllAccountSignals>> getDataByIntervalHour(String start, String finish);*/
	}
