package aybeklerApp.aybekler.entities.concretes;

import java.util.Date;

public class AllAccountSignals {
	
	/* Common Variable */
	private int codeOfAccount;
	private int numberOfPart;
	private String nameOfOrganisation;
	private Date date;
	private String device;
	private String codeOfAlert;
	private String locationOrUser;
	private String message;
	private String operator;

	
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


