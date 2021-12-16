package aybeklerApp.aybekler.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.entities.concretes.AllAccountSignals;

public interface AllAccountSignalsDao extends JpaRepository<AllAccountSignals, Integer> {
	
	List<AllAccountSignals> getDataByRegion(String locationOrUser);

}
