package aybeklerApp.aybekler.entities.concretes;

import java.util.Date;

public class FormOfService {
	
	/* Common Variables */
	private int codeOfAccount;
	private String numberOfDepartment;
	private String nameOfAccount;
	private Date date;
	private String result;
	
	/* Constructor */
	public FormOfService(int codeOfAccount, String numberOfDepartment, String nameOfAccount, Date date, String result) {
		super();
		this.codeOfAccount = codeOfAccount;
		this.numberOfDepartment = numberOfDepartment;
		this.nameOfAccount = nameOfAccount;
		this.date = date;
		this.result = result;
	}
	
	/* Getter Setter */
	public int getCodeOfAccount() {
		return codeOfAccount;
	}

	public void setCodeOfAccount(int codeOfAccount) {
		this.codeOfAccount = codeOfAccount;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
}

/*
 * Description:
 * --------------
 * This class contains the form of service.
 * 
 * Parameters:
 * --------------
 * codeOfAccount: It's the private integer value that is assigned into each customer. We achieve all customer through the code of account;
 * numberOfDepartment: It's the number of department.
 * nameOfAccount: It's the name of account.
 * date: It's the date of service's form.
 * result: It's the result of service's form.
 * 
 * Returns:
 * --------------
 * None
 * 
 * */
