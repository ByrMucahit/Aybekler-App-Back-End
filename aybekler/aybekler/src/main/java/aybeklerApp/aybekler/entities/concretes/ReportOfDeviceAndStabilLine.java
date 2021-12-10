package aybeklerApp.aybekler.entities.concretes;

public class ReportOfDeviceAndStabilLine {
	
	/* Common Variables */
	private int codeOfAccount;
	private int numberOfDepartment;
	private String nameOfAccount;
	private String device;
	private String situation;
	private String city;
	private String town;
	
	/* Constructors */
	public ReportOfDeviceAndStabilLine(int codeOfAccount, int numberOfDepartment, String nameOfAccount, String device,
			String situation, String city, String town) {
		super();
		this.codeOfAccount = codeOfAccount;
		this.numberOfDepartment = numberOfDepartment;
		this.nameOfAccount = nameOfAccount;
		this.device = device;
		this.situation = situation;
		this.city = city;
		this.town = town;
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

	public String getNameOfAccount() {
		return nameOfAccount;
	}

	public void setNameOfAccount(String nameOfAccount) {
		this.nameOfAccount = nameOfAccount;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
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
}

/*
 * Description:
 * --------------
 * This class contain detail of device.
 * 
 * Parameters:
 * --------------
 * codeOfAccount: It's the private integer value that is assigned into each customer. We reach the any user through the code of account.
 * numberOfDepartment: It's the number of department.
 * nameOfAccount: It's the name of customer.
 * device: It's the name of device.
 * situation: It's the explanation of situation.
 * city: It's the name of city.
 * town: It's the name of town.
 * 
 * Returns:
 * -------------
 * None
 *  */
