package aybeklerApp.aybekler.dataAccess.abstracts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import aybeklerApp.aybekler.entities.concretes.FooterTableGivingNewsToPerson;

public interface FooterTableGivingNewsToPersonDao extends JpaRepository<FooterTableGivingNewsToPerson, Integer> {

}
