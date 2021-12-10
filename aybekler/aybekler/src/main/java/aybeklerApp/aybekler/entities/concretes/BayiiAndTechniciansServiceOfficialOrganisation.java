package aybeklerApp.aybekler.entities.concretes;

public class BayiiAndTechniciansServiceOfficialOrganisation {
	
	/* Common Variables */
	private String fullName;
	private String telephone;
	private String phone;
	private String mail;
	
	/* Constructors */
	public BayiiAndTechniciansServiceOfficialOrganisation(String fullName, String telephone, String phone,
			String mail) {
		super();
		this.fullName = fullName;
		this.telephone = telephone;
		this.phone = phone;
		this.mail = mail;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}

/*
 * Description:
 * --------------
 * This class contains details of company.
 * 
 * Parameters:
 * -------------
 * fullName: It's name of Company.
 * telephone: It's number of telephone.
 * phone: It's number of phone.
 * mail: It's mail of company.
 * 
 * Returns:
 * ------------
 * None.
 * */
