package aybeklerApp.aybekler.business.abstracts;

import java.util.List;

import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.entities.concretes.OpeningClosingCard;
public interface OpeningClosingCardService {
	DataResult<List<OpeningClosingCard>> getAll();
}
