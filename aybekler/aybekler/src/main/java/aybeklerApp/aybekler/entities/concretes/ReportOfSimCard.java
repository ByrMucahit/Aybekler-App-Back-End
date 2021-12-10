package aybeklerApp.aybekler.entities.concretes;

public class ReportOfSimCard {

	/* Common Variables */
	private int codeOfAccount;
	private int numberOfDepartment;
	private String nameOfAccount;
	private int numberOfSimCard;
	private String situation;
	private String city;
	private String town;
	
	/* Constructor */
	public ReportOfSimCard(int codeOfAccount, int numberOfDepartment, String nameOfAccount, int numberOfSimCard,
			String situation, String city, String town) {
		super();
		this.codeOfAccount = codeOfAccount;
		this.numberOfDepartment = numberOfDepartment;
		this.nameOfAccount = nameOfAccount;
		this.numberOfSimCard = numberOfSimCard;
		this.situation = situation;
		this.city = city;
		this.town = town;
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

	public int getNumberOfSimCard() {
		return numberOfSimCard;
	}

	public void setNumberOfSimCard(int numberOfSimCard) {
		this.numberOfSimCard = numberOfSimCard;
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
 * This class contains information about the simcard's report.
 * 
 * Parameters:
 * --------------
 * codeOfAccount: It's the private integer value that is assigned into each customer. We reach any person through this code of account.
 * numberOfDepartment: It's the number of department.
 * nameOfAccount: It's the name of account.
 * numberOfSimCard: It's the number of simcard.
 * situation: It's the explanation of situation.
 * city: It's the name of city.
 * town: It's the name of town.
 * 
 * Returns:
 * ------------
 * None
 *  */
