package aybeklerApp.aybekler.dataAccess.abstracts.dto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import aybeklerApp.aybekler.entities.concretes.CustomerCard;

public interface CustomerCardByDto extends JpaRepository<CustomerCard, Integer> {
	
}

/*
String branchOrCodeOfAtm, 
			String ipOfSystem,
			String markOfSystem,
			String modelOfSystem,
			String systemOfPhone,
			String phone1,
			String phone2,
			String phone3,
			String faksNumber1,
			String faksNumber2,
			String atmBranchCode,
			String email1,
			String email2,
			String email3,
			String email4,
			String email5,
			String simCardNumber,
			String neighboorHood,
			String avenue,
			String street,
			String numberOfOutDoor,
			String address1,
			String address2,
			String country,
			String city,
			String town,
			String codeOfPost,
			String location,
			String occupationOfAccount
*/