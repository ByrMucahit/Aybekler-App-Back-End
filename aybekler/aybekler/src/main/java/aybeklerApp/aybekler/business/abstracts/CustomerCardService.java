package aybeklerApp.aybekler.business.abstracts;

import java.util.List;

import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;
import aybeklerApp.aybekler.entities.concretes.CustomerCard;
import aybeklerApp.aybekler.entities.dtos.CustomerCardDto;


public interface CustomerCardService {
	
	DataResult<List<CustomerCard>> getAll();
	Result insertInto(CustomerCard customerCard);
	Result update(CustomerCardDto customerCardDto, int codeOfAccount);
	Result deleteById(int codeOfAccount);
}
