package aybeklerApp.aybekler.dataAccess.abstracts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import aybeklerApp.aybekler.entities.concretes.OpeningClosingCard;

public interface OpeningClosingCardDao extends JpaRepository<OpeningClosingCard, Integer> {

}
