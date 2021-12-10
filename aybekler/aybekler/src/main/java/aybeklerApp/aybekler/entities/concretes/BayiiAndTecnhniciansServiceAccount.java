package aybeklerApp.aybekler.entities.concretes;

public class BayiiAndTecnhniciansServiceAccount {
	
	/* Common Variables */
	private int codeOfAccount;
	private int numberOfLocation;
	private String city;
	private String town;
	
	/* Constructors */
	public BayiiAndTecnhniciansServiceAccount(int codeOfAccount, int numberOfLocation, String city, String town) {
		super();
		this.codeOfAccount = codeOfAccount;
		this.numberOfLocation = numberOfLocation;
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

	public int getNumberOfLocation() {
		return numberOfLocation;
	}

	public void setNumberOfLocation(int numberOfLocation) {
		this.numberOfLocation = numberOfLocation;
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
 * ---------------
 * This class contains detail of accounts.
 * 
 * Parameters:
 * ---------------
 * codeOfAccount: It's private integer value that it's assigned into each person. We reach any person through the code of account.
 * numberOfLocation: It's number of location.
 * city: It's name of city.
 * town: It's name of town.
 * 	
 * Returns:
 * --------------
 * None.
 *  */
 