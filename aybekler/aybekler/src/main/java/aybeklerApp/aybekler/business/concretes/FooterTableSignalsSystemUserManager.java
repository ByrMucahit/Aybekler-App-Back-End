package aybeklerApp.aybekler.business.concretes;
import java.util.List;

import org.springframework.stereotype.Service;

import aybeklerApp.aybekler.business.abstracts.FooterTableSignalsSystemUserService;
import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;
import aybeklerApp.aybekler.core.utilities.results.SuccessDataResult;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<FooterTableSignalsSystemUser>> getAll() {
		
		return new SuccessDataResult<List<FooterTableSignalsSystemUser>>
		(footerTableSignalsSystemUserDao.findAll(),"Data has been listed.");
	}

	@Override
	public Result update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result deleteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
