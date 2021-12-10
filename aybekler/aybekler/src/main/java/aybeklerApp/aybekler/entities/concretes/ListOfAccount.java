package aybeklerApp.aybekler.entities.concretes;

import java.util.Date;

public class ListOfAccount {
	
	/* Common Variables */
	private int codeOfAccount;
	private int numberOfLocation;
	private int numberOfAccount;
	private String city;
	private String town;
	private Date dateOfConnection;
	
	/* Constructors */
	public ListOfAccount(int codeOfAccount, int numberOfLocation, int numberOfAccount, String city, String town,
			Date dateOfConnection) {
		super();
		this.codeOfAccount = codeOfAccount;
		this.numberOfLocation = numberOfLocation;
		this.numberOfAccount = numberOfAccount;
		this.city = city;
		this.town = town;
		this.dateOfConnection = dateOfConnection;
	}
	
	/* Getter Setter */
	public int getCodeOfAccount() {
		return codeOfAccount;
	}

	public void setCodeOfAccount(int codeOfAccount) {
		this.codeOfAccount = codeOfAccount;
	}

	public int getNumberOfLocation() {
		return numberOfLocation;
	}

	public void setNumberOfLocation(int numberOfLocation) {
		this.numberOfLocation = numberOfLocation;
	}

	public int getNumberOfAccount() {
		return numberOfAccount;
	}

	public void setNumberOfAccount(int numberOfAccount) {
		this.numberOfAccount = numberOfAccount;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public Date getDateOfConnection() {
		return dateOfConnection;
	}

	public void setDateOfConnection(Date dateOfConnection) {
		this.dateOfConnection = dateOfConnection;
	}
}

/*
 * Description:
 * ---------------
 * This class contains details of accounts.
 * 
 * ParameterS:
 * ---------------
 * codeOfAccount: It's the private integer value that is assigned into each customer. We achieve the any customer thorugh this code of account.
 * numberOfLocation: It's the number of location.
 * numberOfAccount: It's the number of account.
 * city: It's the name of city where customer have been.
 * town: It's the name of town where customer have been.
 * dateOfConnection: It's the date of connection.
 * 
 * Returns:
 * ---------------
 * None
 *  
 *  
 *  */
