package aybeklerApp.aybekler.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import aybeklerApp.aybekler.entities.concretes.AllAccountSignals;

public interface AllAccountSignalsDao extends JpaRepository<AllAccountSignals, Integer> {
	
	
}
