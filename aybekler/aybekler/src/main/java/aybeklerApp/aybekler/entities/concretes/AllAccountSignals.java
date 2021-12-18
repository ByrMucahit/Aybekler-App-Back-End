package aybeklerApp.aybekler.entities.concretes;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="allaccountsignals")
@AllArgsConstructor
@NoArgsConstructor
public class AllAccountSignals {
	@Id
	/* Common Variable */
	@Column(name="code_of_account")
	private int codeOfAccount;
	
	@Column(name="number_of_part")
	private int numberOfPart;
	
	@Column(name="name_of_organisation")
	private String nameOfOrganisation;
	
	@Column(name="dates")
	private LocalDate dates;
	
	@Column(name="device")
	private String device;
	
	@Column(name="code_of_alert")
	private String codeOfAlert;
	
	@Column(name="location_or_user")
	private String region;
	
	@Column(name="messages")
	private String message;
	
	@Column(name="operators")
	private String operator;
	
	@Column(name="occupation")
	private String occupation;
	
	@Column(name="periods")
	private String period;

	
	public AllAccountSignals() {
		
	}
	
	/* Constructor */
	public AllAccountSignals(int codeOfAccount, int numberOfPart, String nameOfOrganisation, LocalDate dates, String device,
			String codeOfAlert, String region, String message, String operator, String occupation, String period) {
		super();
		this.codeOfAccount = codeOfAccount;
		this.numberOfPart = numberOfPart;
		this.nameOfOrganisation = nameOfOrganisation;
		this.dates = dates;
		this.device = device;
		this.codeOfAlert = codeOfAlert;
		this.region = region;
		this.message = message;
		this.operator = operator;
		this.occupation = occupation;
		this.period = period;
	}


	public int getCodeOfAccount() {
		return codeOfAccount;
	}


	public void setCodeOfAccount(int codeOfAccount) {
		this.codeOfAccount = codeOfAccount;
	}


	public int getNumberOfPart() {
		return numberOfPart;
	}


	public void setNumberOfPart(int numberOfPart) {
		this.numberOfPart = numberOfPart;
	}


	public String getNameOfOrganisation() {
		return nameOfOrganisation;
	}


	public void setNameOfOrganisation(String nameOfOrganisation) {
		this.nameOfOrganisation = nameOfOrganisation;
	}


	public LocalDate getDates() {
		return dates;
	}


	public void setDates(LocalDate dates) {
		this.dates = dates;
	}


	public String getDevice() {
		return device;
	}


	public void setDevice(String device) {
		this.device = device;
	}


	public String getCodeOfAlert() {
		return codeOfAlert;
	}


	public void setCodeOfAlert(String codeOfAlert) {
		this.codeOfAlert = codeOfAlert;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getOperator() {
		return operator;
	}


	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public String getPeriod() {
		return period;
	}


	public void setPeriod(String period) {
		this.period = period;
	}
	
}

/*
 * Description:
 * --------------
 * This class contains details about all signals;
 * 
 * Parameters:
 * -------------
 * codeOfAccount: It's integer value that is passed into individual customer. We can reach any customer through this code.
 * numberOfPart: It's number of part.
 * nameOfOrganisation: It's name of company.
 * date: It's date that signals reached.
 * device: It's name of device.
 * codeOfAlert: It's private integer value. It's assigned into each device to reach device that we desired.
 * locationOrUser: It can be either name of location and name of user.
 * message: It's message releated signal.
 * operator: It's operator
 * 
 * Return:
 * -------------
 * null 
 *  */


