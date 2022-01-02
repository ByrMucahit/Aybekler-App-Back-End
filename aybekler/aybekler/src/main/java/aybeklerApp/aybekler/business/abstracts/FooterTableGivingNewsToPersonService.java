package aybeklerApp.aybekler.business.abstracts;

import aybeklerApp.aybekler.core.utilities.results.Result;

import java.util.List;

import aybeklerApp.aybekler.core.utilities.results.DataResult;
import aybeklerApp.aybekler.entities.concretes.FooterTableGivingNewsToPerson;


public interface FooterTableGivingNewsToPersonService {

	Result insertInto(FooterTableGivingNewsToPerson footerTableGivingNewsToPerson);
	DataResult<List<FooterTableGivingNewsToPerson>> getAll();
	Result update(int idOfAccount, FooterTableGivingNewsToPerson footerTableGivingNewsToPerson);
	Result delete(int idOfAccount);
	
}
