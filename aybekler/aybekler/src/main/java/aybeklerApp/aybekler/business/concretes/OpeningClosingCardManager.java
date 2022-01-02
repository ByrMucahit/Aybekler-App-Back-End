package aybeklerApp.aybekler.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import aybeklerApp.aybekler.business.abstracts.OpeningClosingCardService;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.SuccessDataResult;
import aybeklerApp.aybekler.dataAccess.abstracts.dao.OpeningClosingCardDao;
import aybeklerApp.aybekler.entities.concretes.OpeningClosingCard;

public class OpeningClosingCardManager implements OpeningClosingCardService {

	private OpeningClosingCardDao openingClosingCardDao;
	
	@Autowired
	public OpeningClosingCardManager(OpeningClosingCardDao openingClosingCardDao) {
		this.openingClosingCardDao = openingClosingCardDao;
	}
	
	@Override
	public DataResult<List<OpeningClosingCard>> getAll() {
		
		return new SuccessDataResult<List<OpeningClosingCard>>
		(this.openingClosingCardDao.findAll(), "Data has been listed");
	}

}
