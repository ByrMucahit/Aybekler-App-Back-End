package aybeklerApp.aybekler.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aybeklerApp.aybekler.business.abstracts.FooterTableGivingNewsToPersonService;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;
import aybeklerApp.aybekler.core.utilities.results.SuccessDataResult;
import aybeklerApp.aybekler.core.utilities.results.SuccessResult;
import aybeklerApp.aybekler.dataAccess.abstracts.dao.FooterTableGivingNewsToPersonDao;
import aybeklerApp.aybekler.entities.concretes.FooterTableGivingNewsToPerson;

@Service
public class FooterTableGivingNewsToPersonManager implements FooterTableGivingNewsToPersonService {
	
	private FooterTableGivingNewsToPersonDao footerTableGivingNewsToPersonDao;
	
	@Autowired
	public FooterTableGivingNewsToPersonManager(FooterTableGivingNewsToPersonDao footerTableGivingNewsToPersonDao) {
		this.footerTableGivingNewsToPersonDao = footerTableGivingNewsToPersonDao;
	}
	
	@Override
	public Result insertInto(FooterTableGivingNewsToPerson footerTableGivingNewsToPerson) {
		this.footerTableGivingNewsToPersonDao.save(footerTableGivingNewsToPerson);
		
		return new SuccessResult("Data has been added into database");
	}

	@Override
	public DataResult<List<FooterTableGivingNewsToPerson>> getAll() {
		return new SuccessDataResult<List<FooterTableGivingNewsToPerson>>
		(this.footerTableGivingNewsToPersonDao.findAll(),"Data has been listed");
	}

	@Override
	public Result update(int idOfAccount, FooterTableGivingNewsToPerson footerTableGivingNewsToPerson) {
		FooterTableGivingNewsToPerson currentGivingNewsToPerson = footerTableGivingNewsToPersonDao.findById(idOfAccount).orElseThrow(RuntimeException::new);
		currentGivingNewsToPerson.setAlert(footerTableGivingNewsToPerson.getAlert());
		currentGivingNewsToPerson.setFamily(footerTableGivingNewsToPerson.getFamily());
		currentGivingNewsToPerson.setFullName(footerTableGivingNewsToPerson.getFullName());
		currentGivingNewsToPerson.setOrderOfPanel(footerTableGivingNewsToPerson.getOrderOfPanel());
		currentGivingNewsToPerson.setPhone1(footerTableGivingNewsToPerson.getPhone1());
		currentGivingNewsToPerson.setPhone2(footerTableGivingNewsToPerson.getPhone2());
		currentGivingNewsToPerson.setPhone3(footerTableGivingNewsToPerson.getPhone3());
		currentGivingNewsToPerson.setPhone4(footerTableGivingNewsToPerson.getPhone4());
		currentGivingNewsToPerson.setRegisterNumber(footerTableGivingNewsToPerson.getRegisterNumber());
		currentGivingNewsToPerson.setTask(footerTableGivingNewsToPerson.getTask());
		
		footerTableGivingNewsToPersonDao.save(currentGivingNewsToPerson);
		return new SuccessResult("Data has been updated");
	}

	@Override
	public Result delete(int idOfAccount) {
		footerTableGivingNewsToPersonDao.deleteById(idOfAccount);
		return new SuccessResult("Data that id of account's"+" "+ idOfAccount +" "+"has been deleted");
	}

}
