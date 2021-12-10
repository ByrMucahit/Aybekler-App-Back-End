package aybeklerApp.aybekler.entities.concretes;

public class Users {
	
	/* Common Variables */
	private int codeOfAccount;
	private int numberOfDepartment;
	private String fullName;
	private String nameOfOrganisation;
	private String task;
	private int numberOfRegister;
	private String closer;
	private String phone1;
	private String phone2;
	
	/* Constructor */
	public Users(int codeOfAccount, int numberOfDepartment, String fullName, String nameOfOrganisation, String task,
			int numberOfRegister, String closer, String phone1, String phone2) {
		super();
		this.codeOfAccount = codeOfAccount;
		this.numberOfDepartment = numberOfDepartment;
		this.fullName = fullName;
		this.nameOfOrganisation = nameOfOrganisation;
		this.task = task;
		this.numberOfRegister = numberOfRegister;
		this.closer = closer;
		this.phone1 = phone1;
		this.phone2 = phone2;
	}
	
	/* Getter Setter */
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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNameOfOrganisation() {
		return nameOfOrganisation;
	}

	public void setNameOfOrganisation(String nameOfOrganisation) {
		this.nameOfOrganisation = nameOfOrganisation;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getNumberOfRegister() {
		return numberOfRegister;
	}

	public void setNumberOfRegister(int numberOfRegister) {
		this.numberOfRegister = numberOfRegister;
	}

	public String getCloser() {
		return closer;
	}

	public void setCloser(String closer) {
		this.closer = closer;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
}

/*
 * Description:
 * ---------------
 * This class contains details of the user.
 * 
 * Parameters:
 * ---------------
 * codeOfAccount: It's the private integer value that It's assigned into each user. We reach any user through the code of account.
 * numberOfDepartment: It's the number of department.
 * fullName: It's the name of customer.
 * nameOfOrganisation: It's the name of organisation.
 * task: It's the task that repairman has fixed.
 * numberOfRegister: It's the register number of customer.
 * closer: It's expressed that The one who is closer family of customer.
 * phone1: It's the main telephone number of customer.
 * phone2: It's the alternative telephone number of customer, If we cannot reach.
 * 
 * Returns:
 * ---------------
 * none;
*/

