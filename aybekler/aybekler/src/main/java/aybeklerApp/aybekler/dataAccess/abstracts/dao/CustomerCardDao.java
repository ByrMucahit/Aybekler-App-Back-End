package aybeklerApp.aybekler.dataAccess.abstracts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import aybeklerApp.aybekler.entities.dtos.CustomerCardDto;



public interface CustomerCardDao  extends JpaRepository<CustomerCardDto, Integer> {

}
