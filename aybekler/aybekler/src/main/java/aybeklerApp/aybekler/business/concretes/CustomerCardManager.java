package aybeklerApp.aybekler.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aybeklerApp.aybekler.business.abstracts.CustomerCardService;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;
import aybeklerApp.aybekler.core.utilities.results.SuccessDataResult;
import aybeklerApp.aybekler.core.utilities.results.SuccessResult;
import aybeklerApp.aybekler.dataAccess.abstracts.dao.CustomerCardDao;
import aybeklerApp.aybekler.dataAccess.abstracts.dto.CustomerCardByDto;
import aybeklerApp.aybekler.entities.concretes.CustomerCard;
import aybeklerApp.aybekler.entities.dtos.AllAccountSignalsDto;
import aybeklerApp.aybekler.entities.dtos.CustomerCardDto;
@Service
public class CustomerCardManager implements CustomerCardService {

	private CustomerCardByDto customerCardDto;
	private CustomerCardDao customerCardDao;
	
	@Autowired
	public CustomerCardManager(CustomerCardByDto customerCardDto, CustomerCardDao customerCardDao) {
		super();
		this.customerCardDto = customerCardDto;
		this.customerCardDao = customerCardDao;
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
	public Result update(CustomerCardDto customerCardDto,int codeOfAccount) {
		CustomerCardDto currentCustomerCard = customerCardDao.findById(codeOfAccount).orElseThrow(RuntimeException::new);
		currentCustomerCard.setAddress1(customerCardDto.getAddress1());
		currentCustomerCard.setAddress2(customerCardDto.getAddress2());
		currentCustomerCard.setAtmBranchCode(customerCardDto.getBranchOrCodeOfAtm());
		currentCustomerCard.setAvenue(customerCardDto.getAvenue());
		currentCustomerCard.setCity(customerCardDto.getCity());
		currentCustomerCard.setCodeOfPost(customerCardDto.getCodeOfPost());
		currentCustomerCard.setCountry(customerCardDto.getCountry());
		currentCustomerCard.setEmail1(customerCardDto.getEmail1());
		currentCustomerCard.setEmail2(customerCardDto.getEmail2());
		currentCustomerCard.setEmail3(customerCardDto.getEmail3());
		currentCustomerCard.setEmail4(customerCardDto.getEmail4());
		currentCustomerCard.setEmail5(customerCardDto.getEmail5());
		currentCustomerCard.setFaksNumber1(customerCardDto.getFaksNumber1());
		currentCustomerCard.setFaksNumber2(customerCardDto.getFaksNumber2());
		currentCustomerCard.setIpOfSystem(customerCardDto.getIpOfSystem());
		currentCustomerCard.setLocation(customerCardDto.getIpOfSystem());
		currentCustomerCard.setMarkOfSystem(customerCardDto.getMarkOfSystem());
		currentCustomerCard.setModelOfSystem(customerCardDto.getModelOfSystem());
		currentCustomerCard.setNeighboorHood(customerCardDto.getNeighboorHood());
		currentCustomerCard.setNumberOfOutDoor(customerCardDto.getNumberOfOutDoor());
		currentCustomerCard.setOccupationOfAccount(customerCardDto.getOccupationOfAccount());
		currentCustomerCard.setPhone1(customerCardDto.getPhone1());
		currentCustomerCard.setPhone2(customerCardDto.getPhone2());
		currentCustomerCard.setPhone3(customerCardDto.getPhone3());
		currentCustomerCard.setSimCardNumber(customerCardDto.getSimCardNumber());
		currentCustomerCard.setStreet(customerCardDto.getStreet());
		currentCustomerCard.setSystemOfPhone(customerCardDto.getSystemOfPhone());
		currentCustomerCard.setTown(customerCardDto.getTown());
		currentCustomerCard.setTypeOfCommunicate(customerCardDto.getTypeOfCommunicate());
		
		customerCardDao.save(currentCustomerCard);
		return new SuccessResult("Product has been updated");
	}

	@Override
	public Result deleteById(int codeOfAccount) {
		customerCardDto.deleteById(codeOfAccount);
		return new SuccessResult("Account has been deleted");
	}

}
