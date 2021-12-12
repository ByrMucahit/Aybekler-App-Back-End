package aybeklerApp.aybekler.business.abstracts;
import aybeklerApp.aybekler.entities.concretes.AllAccountSignals;
import aybeklerApp.aybekler.entities.concretes.Muco;
import aybeklerApp.aybekler.core.utilities.results.DataResult;

import java.util.List;

public interface AllAccountSignalsService {
	DataResult<List<AllAccountSignals>> getAll();
}
