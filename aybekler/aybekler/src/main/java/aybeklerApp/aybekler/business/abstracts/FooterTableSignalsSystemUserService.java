package aybeklerApp.aybekler.business.abstracts;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.core.utilities.results.Result;
import aybeklerApp.aybekler.entities.concretes.FooterTableSignalsSystemUser;

public interface FooterTableSignalsSystemUserService {
	
	Result insertInto(FooterTableSignalsSystemUser footerTableSignalsSystemUser);
	DataResult<List<FooterTableSignalsSystemUser>> getAll();
	Result update(FooterTableSignalsSystemUser footerTableSignalsSystemUser,int idOfAccount);
	Result deleteById(int idOfAccount);
}
