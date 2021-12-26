package aybeklerApp.aybekler.dataAccess.abstracts.dto;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import aybeklerApp.aybekler.entities.dtos.AllAccountSignalsDto;

public interface AllAccountSignalsByDto extends JpaRepository<AllAccountSignalsDto, Integer> {
	
	List<AllAccountSignalsDto> getDataByRegion(String locationOrUser);
	List<AllAccountSignalsDto> getDataByOccupation(String occupation);
	List<AllAccountSignalsDto> getDataByPeriod(String period);
	List<AllAccountSignalsDto> getDataByDates(String dates);
	List<AllAccountSignalsDto> getDataByTimes(String times);
}
