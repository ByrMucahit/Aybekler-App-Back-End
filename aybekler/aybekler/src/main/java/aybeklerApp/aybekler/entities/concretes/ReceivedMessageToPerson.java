package aybeklerApp.aybekler.entities.concretes;

public class ReceivedMessageToPerson {
	
	/* Common Variables */
	private int codeOfAccount;
	private String nameOfAccount;
	private String city;
	private String town;
	
	/* Constructor */
	public ReceivedMessageToPerson(int codeOfAccount, String nameOfAccount, String city, String town) {
		super();
		this.codeOfAccount = codeOfAccount;
		this.nameOfAccount = nameOfAccount;
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
}

/*
 * Description:
 * --------------
 * This class contains detail of received message to person.
 * 
 * Parameters:
 * --------------
 * codeOfAccount: It's private integer value that it's assigned into each person.
 * city: It's name of city.
 * town: It's name of town.
 * 
 * Returns:
 * --------------
 * None
 *  */
