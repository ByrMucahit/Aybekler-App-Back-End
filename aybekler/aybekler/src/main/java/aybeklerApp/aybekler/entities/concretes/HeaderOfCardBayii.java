package aybeklerApp.aybekler.entities.concretes;

public class HeaderOfCardBayii {

	/* Common Variables*/
	private int codeOfBayii;
	private String mail;
	private String address;
	private String country;
	private String town;
	private String taxDepartment;
	private String degreeOfBayii;
	private String city;
	private String codeOfPost;
	private String numberOfTax;
	private String phone1;
	private String phone2;
	private String phone3;
	private String faks1;
	private String faks2;
	private Boolean isTechnichServicePassword;
	
	/* Constructors */
	public HeaderOfCardBayii(int codeOfBayii, String mail, String address, String country, String town,
			String taxDepartment, String degreeOfBayii, String city, String codeOfPost, String numberOfTax,
			String phone1, String phone2, String phone3, String faks1, String faks2,
			Boolean isTechnichServicePassword) {
		super();
		this.codeOfBayii = codeOfBayii;
		this.mail = mail;
		this.address = address;
		this.country = country;
		this.town = town;
		this.taxDepartment = taxDepartment;
		this.degreeOfBayii = degreeOfBayii;
		this.city = city;
		this.codeOfPost = codeOfPost;
		this.numberOfTax = numberOfTax;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.faks1 = faks1;
		this.faks2 = faks2;
		this.isTechnichServicePassword = isTechnichServicePassword;
	}

	public int getCodeOfBayii() {
		return codeOfBayii;
	}

	public void setCodeOfBayii(int codeOfBayii) {
		this.codeOfBayii = codeOfBayii;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getTaxDepartment() {
		return taxDepartment;
	}

	public void setTaxDepartment(String taxDepartment) {
		this.taxDepartment = taxDepartment;
	}

	public String getDegreeOfBayii() {
		return degreeOfBayii;
	}

	public void setDegreeOfBayii(String degreeOfBayii) {
		this.degreeOfBayii = degreeOfBayii;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCodeOfPost() {
		return codeOfPost;
	}

	public void setCodeOfPost(String codeOfPost) {
		this.codeOfPost = codeOfPost;
	}

	public String getNumberOfTax() {
		return numberOfTax;
	}

	public void setNumberOfTax(String numberOfTax) {
		this.numberOfTax = numberOfTax;
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

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	public String getFaks1() {
		return faks1;
	}

	public void setFaks1(String faks1) {
		this.faks1 = faks1;
	}

	public String getFaks2() {
		return faks2;
	}

	public void setFaks2(String faks2) {
		this.faks2 = faks2;
	}

	public Boolean getIsTechnichServicePassword() {
		return isTechnichServicePassword;
	}

	public void setIsTechnichServicePassword(Boolean isTechnichServicePassword) {
		this.isTechnichServicePassword = isTechnichServicePassword;
	}
	
}

/*
 * Description:
 * ---------------
 * This class contains details of customer.
 * 
 * Parameters:
 * ---------------
 * codeOfBayii: It's the private integer value that is assigned into each the customer. We can achieve the any  customer through this id.
 * mail: It's the name of mail.
 * address: It's the address of customer.
 * country: It's country of the customer.
 * town: It's the town of customer.
 * taxDepartment: It's the name of tax department.
 * degreeOfBayii: It's the name of bayii's degree.
 * city: It's the name of city.
 * codeOfPost: It's the code of post which customer have been.
 * numberOfTax: It's the number of tax.
 * phone1: It's the main telephone number of user.
 * phone2: It's the alternative telephone number of user.
 * phone3: It's the alternative telephone number of user.
 * faks1: It's the main faks of customer
 * faks2: It's the alternative faks of customer.
 * isTechnichServicePassword: It's the boolean value that request type of password.
 *  
 *  Returns:
 *  ----------
 *  None
 *  */
