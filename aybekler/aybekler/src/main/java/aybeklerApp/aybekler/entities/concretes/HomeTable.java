package aybeklerApp.aybekler.entities.concretes;


import javax.persistence.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter @Setter @NoArgsConstructor // <--- THIS is it
public class HomeTable {	
	
	/* Common Varaibles */
	private String identifyOfAccount;
	private String numberOfDepartment;
	private String nameOfAccount;
	private String city;
	private String timeToHappening;
	private String timeToLastSignal;
	private String situation;
	
	public HomeTable(String identifyOfAccount, String numberOfDepartment, String nameOfAccount, String city,
			String timeToHappening, String timeToLastSignal, String situation) {
		super();
		this.identifyOfAccount = identifyOfAccount;
		this.numberOfDepartment = numberOfDepartment;
		this.nameOfAccount = nameOfAccount;
		this.city = city;
		this.timeToHappening = timeToHappening;
		this.timeToLastSignal = timeToLastSignal;
		this.situation = situation;
	}

	public String getIdentifyOfAccount() {
		return identifyOfAccount;
	}

	public void setIdentifyOfAccount(String identifyOfAccount) {
		this.identifyOfAccount = identifyOfAccount;
	}

	public String getNumberOfDepartment() {
		return numberOfDepartment;
	}

	public void setNumberOfDepartment(String numberOfDepartment) {
		this.numberOfDepartment = numberOfDepartment;
	}

	public String getNameOfAccount() {
		return nameOfAccount;
	}

	public void setNameOfAccount(String nameOfAccount) {
		this.nameOfAccount = nameOfAccount;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTimeToHappening() {
		return timeToHappening;
	}

	public void setTimeToHappening(String timeToHappening) {
		this.timeToHappening = timeToHappening;
	}

	public String getTimeToLastSignal() {
		return timeToLastSignal;
	}

	public void setTimeToLastSignal(String timeToLastSignal) {
		this.timeToLastSignal = timeToLastSignal;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

}


/*
 * Description:
 * --------------
 * It's a table in homePage. It includes information about customer and device.
 * 
 * Parameters:
 * --------------
 * identifyOfAccount: It's Id that is passed to individual customer.
 * numberOfDepartment: It's number of department. It's prepared by company. 
 * nameOfAccount: It's name of customer.
 * city: It's city customer lives in.
 * timeToHappening: It's the process such as fix the problem.
 * timeToLastSignals: It's time expression of last come signals.
 * situation: It's explanation what did repairmen do and Is problem fixed ?
 * 
 * Return :
 * -------------
 * None
 *  */
