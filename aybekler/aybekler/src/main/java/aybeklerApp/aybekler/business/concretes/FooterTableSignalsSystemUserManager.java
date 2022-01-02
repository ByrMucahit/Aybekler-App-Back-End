package aybeklerApp.aybekler.business.concretes;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import aybeklerApp.aybekler.business.abstracts.FooterTableSignalsSystemUserService;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;
import aybeklerApp.aybekler.core.utilities.results.SuccessDataResult;
import aybeklerApp.aybekler.core.utilities.results.SuccessResult;
import aybeklerApp.aybekler.dataAccess.abstracts.dao.FooterTableSignalsSystemUserDao;
import aybeklerApp.aybekler.entities.concretes.FooterTableSignalsSystemUser;

@Service
public class FooterTableSignalsSystemUserManager implements FooterTableSignalsSystemUserService {
	
	private FooterTableSignalsSystemUserDao footerTableSignalsSystemUserDao;
	
	public FooterTableSignalsSystemUserManager(FooterTableSignalsSystemUserDao footerTableSignalsSystemUserDao) {
		this.footerTableSignalsSystemUserDao = footerTableSignalsSystemUserDao;
	}

	@Override
	public Result insertInto(FooterTableSignalsSystemUser footerTableSignalsSystemUser) {
		footerTableSignalsSystemUserDao.save(footerTableSignalsSystemUser);
		return new SuccessResult("Data has been added.");
	}

	@Override
	public DataResult<List<FooterTableSignalsSystemUser>> getAll() {
		
		return new SuccessDataResult<List<FooterTableSignalsSystemUser>>
		(footerTableSignalsSystemUserDao.findAll(),"Data has been listed.");
	}

	@Override
	public Result update(FooterTableSignalsSystemUser footerTableSignalsSystemUser, int idOfAccount) {
		FooterTableSignalsSystemUser currentSystemUser = footerTableSignalsSystemUserDao.findById(idOfAccount).orElseThrow(RuntimeException::new);
		currentSystemUser.setAlert(footerTableSignalsSystemUser.getAlert());
		currentSystemUser.setFamily(footerTableSignalsSystemUser.getFamily());
		currentSystemUser.setFullName(footerTableSignalsSystemUser.getFamily());
		currentSystemUser.setOrderOfPanel(footerTableSignalsSystemUser.getOrderOfPanel());
		currentSystemUser.setPhone1(footerTableSignalsSystemUser.getPhone1());
		currentSystemUser.setPhone2(footerTableSignalsSystemUser.getPhone2());
		currentSystemUser.setPhone3(footerTableSignalsSystemUser.getPhone3());
		currentSystemUser.setPhone4(footerTableSignalsSystemUser.getPhone4());
		currentSystemUser.setRegisterNumber(footerTableSignalsSystemUser.getRegisterNumber());
		currentSystemUser.setTask(footerTableSignalsSystemUser.getTask());
		
		footerTableSignalsSystemUserDao.save(currentSystemUser);
		return new SuccessResult("Data has been updated");
	}

	@Override
	public Result deleteById(int idOfAccount) {
		footerTableSignalsSystemUserDao.deleteById(idOfAccount);
		return new SuccessResult("Data has been deleted.");
	}

}
