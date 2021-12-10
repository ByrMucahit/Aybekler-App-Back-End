package aybeklerApp.aybekler.entities.concretes;

import java.util.Date;

public class LiveBayiiSignals {
	
	/* Common Variables */
	private int codeOfAccount;
	private String device;
	private int numberOfPart;
	private String nameOfOrganisation;
	private Date date;
	private int codeOfAlert;
	private String locationOrUser;
	private String message;
	private String operator;
	
	/* Constructor */
	public LiveBayiiSignals(int codeOfAccount, String device, int numberOfPart, String nameOfOrganisation, Date date,
			int codeOfAlert, String locationOrUser, String message, String operator) {
		super();
		this.codeOfAccount = codeOfAccount;
		this.device = device;
		this.numberOfPart = numberOfPart;
		this.nameOfOrganisation = nameOfOrganisation;
		this.date = date;
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

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
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

	public int getCodeOfAlert() {
		return codeOfAlert;
	}

	public void setCodeOfAlert(int codeOfAlert) {
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
 * This class does show the signals in live.
 * 
 * Parameters:
 * -------------
 * codeOfAccount: It's the private integer value that is assigned into the individual customer. All detail is achieved through the code.
 * device: It's name of the device.
 * numberOfPart: It's number of the part.
 * nameOfOrganisation: It's name of the company.
 * date: It's date of signals in live.
 * codeOfAlert: It's private integer value that is assigned into individual device. All device is achieved through the code.
 * locationOrUser: It can be either name of user or name of location.
 * message: It's message releated signals.
 * operator: It's operator.
 * 
 * Returns:
 * ------------
 * None
 *  
 *  */
