package aybeklerApp.aybekler.entities.concretes;

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
	private Date date;
	
	@Column(name="device")
	private String device;
	
	@Column(name="code_of_alert")
	private String codeOfAlert;
	
	@Column(name="location_or_user")
	private String locationOrUser;
	
	@Column(name="messages")
	private String message;
	
	@Column(name="operators")
	private String operator;

	@Autowired
	/* Constructor */
	public AllAccountSignals(int codeOfAccount, int numberOfPart, String nameOfOrganisation, Date date, String device,
			String codeOfAlert, String locationOrUser, String message, String operator) {
		super();
		this.codeOfAccount = codeOfAccount;
		this.numberOfPart = numberOfPart;
		this.nameOfOrganisation = nameOfOrganisation;
		this.date = date;
		this.device = device;
		this.codeOfAlert = codeOfAlert;
		this.locationOrUser = locationOrUser;
		this.message = message;
		this.operator = operator;
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


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
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


	public String getLocationOrUser() {
		return locationOrUser;
	}


	public void setLocationOrUser(String locationOrUser) {
		this.locationOrUser = locationOrUser;
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


