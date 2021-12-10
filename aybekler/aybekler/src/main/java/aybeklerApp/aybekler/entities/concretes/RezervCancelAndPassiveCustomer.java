package aybeklerApp.aybekler.entities.concretes;

import java.util.Date;

public class RezervCancelAndPassiveCustomer {

	/* Common Variables */
	private int codeOfAccount;
	private int numberOfDepartment;
	private String nameOfAccount;
	private String city;
	private String town;
	private Date dateOfCancel;
	
	/* Constructor */
	public RezervCancelAndPassiveCustomer(int codeOfAccount, int numberOfDepartment, String nameOfAccount, String city,
			String town, Date dateOfCancel) {
		super();
		this.codeOfAccount = codeOfAccount;
		this.numberOfDepartment = numberOfDepartment;
		this.nameOfAccount = nameOfAccount;
		this.city = city;
		this.town = town;
		this.dateOfCancel = dateOfCancel;
	}

	public int getCodeOfAccount() {
		return codeOfAccount;
	}

	public void setCodeOfAccount(int codeOfAccount) {
		this.codeOfAccount = codeOfAccount;
	}

	public int getNumberOfDepartment() {
		return numberOfDepartment;
	}

	public void setNumberOfDepartment(int numberOfDepartment) {
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

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public Date getDateOfCancel() {
		return dateOfCancel;
	}

	public void setDateOfCancel(Date dateOfCancel) {
		this.dateOfCancel = dateOfCancel;
	}
	
}

/*
 * Description:
 * --------------
 * This class contains transaction's details of the customer.
 * 
 * Parameters:
 * -------------
 * codeOfAccount: It's private code of account.
 * nameOfAccount: It's name of account.
 * city: It's hometown of customer.
 * town: It's town of customer.
 * dateOfCancel: It's date of cancel. 
 * 
 * Returns:
 * -------------
 * None
 * */
