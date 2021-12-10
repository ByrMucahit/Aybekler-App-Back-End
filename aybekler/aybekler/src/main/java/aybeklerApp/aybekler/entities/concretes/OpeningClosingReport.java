package aybeklerApp.aybekler.entities.concretes;

public class OpeningClosingReport {
	
	/* Common Variables */
	private int numberOfCode;
	private int numberOfDepartment;
	private String nameOfAccount;
	private String opening;
	private String closing;
	private int codeOfTerm;

	
	/* constructor */
	public OpeningClosingReport(int numberOfCode, int numberOfDepartment, String nameOfAccount, String opening,
			String closing, int codeOfTerm) {
		super();
		this.numberOfCode = numberOfCode;
		this.numberOfDepartment = numberOfDepartment;
		this.nameOfAccount = nameOfAccount;
		this.opening = opening;
		this.closing = closing;
		this.codeOfTerm = codeOfTerm;
	}


	public int getNumberOfCode() {
		return numberOfCode;
	}


	public void setNumberOfCode(int numberOfCode) {
		this.numberOfCode = numberOfCode;
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


	public String getOpening() {
		return opening;
	}


	public void setOpening(String opening) {
		this.opening = opening;
	}


	public String getClosing() {
		return closing;
	}


	public void setClosing(String closing) {
		this.closing = closing;
	}


	public int getCodeOfTerm() {
		return codeOfTerm;
	}


	public void setCodeOfTerm(int codeOfTerm) {
		this.codeOfTerm = codeOfTerm;
	}
	
}

/*
 * Description:
 * -------------
 * This class contains detail of opening hour and closing hour.
 *  
 * Parameters:
 * ------------
 * numberOfCode: It's account code of customer.
 * numberOfDepartment: It's number of department.
 * nameOfAccount: It's the name of account.
 * opening: It's hour of opening.
 * closing: It's hour of closing.
 * codeOfTerm: It's code of term.
 *  
 * Returns:
 * ----------
 * None
 *  */
 