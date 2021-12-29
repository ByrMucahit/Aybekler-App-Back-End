package aybeklerApp.aybekler.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aybeklerApp.aybekler.business.abstracts.CustomerCardService;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;
import aybeklerApp.aybekler.core.utilities.results.SuccessDataResult;
import aybeklerApp.aybekler.core.utilities.results.SuccessResult;
import aybeklerApp.aybekler.dataAccess.abstracts.dto.CustomerCardByDto;
import aybeklerApp.aybekler.entities.concretes.CustomerCard;
import aybeklerApp.aybekler.entities.dtos.AllAccountSignalsDto;
@Service
public class CustomerCardManager implements CustomerCardService {

	private CustomerCardByDto customerCardDto;
	
	@Autowired
	public CustomerCardManager(CustomerCardByDto customerCardDto) {
		super();
		this.customerCardDto = customerCardDto;
	}
	
	@Override
	public DataResult<List<CustomerCard>> getAll() {
		
		return new SuccessDataResult<List<CustomerCard>>
		(this.customerCardDto.findAll(), "Data has been listed");
	}

	@Override
	public Result insertInto(CustomerCard customerCard) {
		this.customerCardDto.save(customerCard);
		return new SuccessResult("Product has been added");
	}

	@Override
	public Result update(CustomerCard customerCard) {
		this.customerCardDto.update(customerCard.getTypeOfCommunicate());
		return new SuccessResult("Product has been updated");
	}

}
