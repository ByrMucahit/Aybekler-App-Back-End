package aybeklerApp.aybekler.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/*
 * Documents:
 * ------------
 * @Data: The Lombok annotation @Data simply tells to IDE or your build tool like Maven or Ant, to generate all the boilerplate code for you silently during compiler time.
 * @Entity: The @Entity annonation specifies that the class in an entity and is mapped to a database table.
 * @Table: The @Table annotation specifies that which table matches entity class from entity dimension. 
 * */

@Data
@Entity
@Table(name="customercard")
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCard {
	
	/* Common Variables */
	@Id
	@Column(name="code_of_account")
	private int codeOfAccount;
	
	@Column(name="technical_service_organisation")
	private String technicalServiceOrganisation;
	
	@Column(name="groups_of_customer")
	private String groupsOfCustomer;
	
	@Column(name="table_of_signals")
	private String tableOfSignals;
	
	@Column(name="type_of_communication")
	private String typeOfCommunicate;
	
	@Column(name="branch_or_code_of_atm")
	private String branchOrCodeOfAtm;
	
	@Column(name="ip_of_sytem")
	private String ipOfSystem;
	
	@Column(name="mark_of_sytem")
	private String markOfSystem;
	
	@Column(name="model_of_system")
	private String modelOfSystem;
	
	@Column(name="date_of_connection")
	private Date dateOfConnection;
	
	@Column(name="date_of_starting")
	private Date dateOfStarting;
	
	@Column(name="date_of_finishing")
	private Date dateOfFinishing;
	
	@Column(name="system_of_phone")
	private String systemOfPhone;
	
	@Column(name="phone1")
	private String phone1;
	
	@Column(name="phone2")
	private String phone2;
	
	@Column(name="phone3")
	private String phone3;
	
	@Column(name="faks_number1")
	private String faksNumber1;
	
	@Column(name="faks_number2")
	private String faksNumber2;
	
	@Column(name="atm_branch_code")
	private String atmBranchCode;
	
	@Column(name="email1")
	private String email1;
	
	@Column(name="email2")
	private String email2;
	
	@Column(name="email3")
	private String email3;
	
	@Column(name="email4")
	private String email4;
	
	@Column(name="email5")
	private String email5;
	
	@Column(name="sim_card_number")
	private String simCardNumber;
	
	@Column(name="neighbordhood")
	private String neighboorHood;
	
	@Column(name="avenue")
	private String avenue;
	
	@Column(name="street")
	private String street;
	
	@Column(name="number_of_outdoor")
	private String numberOfOutDoor;
	
	@Column(name="address1")
	private String address1;
	
	@Column(name="address2")
	private String address2;
	
	@Column(name="country")
	private String country;
	
	@Column(name="city")
	private String city;
	
	@Column(name="town")
	private String town;
	
	@Column(name="code_Of_Post")
	private String codeOfPost;
	
	@Column(name="locate")
	private String location;
	
	@Column(name="occupation_of_account")
	private String occupationOfAccount;
	
	
	public CustomerCard() {
		
	}
	
	/* Constructors */
	public CustomerCard(String technicalServiceOrganisation, String groupsOfCustomer, String tableOfSignals,
			String typeOfCommunicate, String branchOrCodeOfAtm, String ipOfSystem, String markOfSystem,
			String modelOfSystem, Date dateOfConnection, Date dateOfStarting, Date dateOfFinishing,
			String systemOfPhone, String phone1, String phone2, String phone3, String faksNumber1, String faksNumber2,
			String atmBranchCode, String email1, String email2, String email3, String email4, String email5,
			String simCardNumber, String neighboorHood, String avenue, String street, String numberOfOutDoor,
			String address1, String address2, String country, String city, String town, String codeOfPost,
			String location, String occupationOfAccount, int codeOfAccount) {
		super();
		this.technicalServiceOrganisation = technicalServiceOrganisation;
		this.groupsOfCustomer = groupsOfCustomer;
		this.tableOfSignals = tableOfSignals;
		this.typeOfCommunicate = typeOfCommunicate;
		this.branchOrCodeOfAtm = branchOrCodeOfAtm;
		this.ipOfSystem = ipOfSystem;
		this.markOfSystem = markOfSystem;
		this.modelOfSystem = modelOfSystem;
		this.dateOfConnection = dateOfConnection;
		this.dateOfStarting = dateOfStarting;
		this.dateOfFinishing = dateOfFinishing;
		this.systemOfPhone = systemOfPhone;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.faksNumber1 = faksNumber1;
		this.faksNumber2 = faksNumber2;
		this.atmBranchCode = atmBranchCode;
		this.email1 = email1;
		this.email2 = email2;
		this.email3 = email3;
		this.email4 = email4;
		this.email5 = email5;
		this.simCardNumber = simCardNumber;
		this.neighboorHood = neighboorHood;
		this.avenue = avenue;
		this.street = street;
		this.numberOfOutDoor = numberOfOutDoor;
		this.address1 = address1;
		this.address2 = address2;
		this.country = country;
		this.city = city;
		this.town = town;
		this.codeOfPost = codeOfPost;
		this.location = location;
		this.occupationOfAccount = occupationOfAccount;
		this.codeOfAccount = codeOfAccount;
	}

	public String getTechnicalServiceOrganisation() {
		return technicalServiceOrganisation;
	}

	public void setTechnicalServiceOrganisation(String technicalServiceOrganisation) {
		this.technicalServiceOrganisation = technicalServiceOrganisation;
	}

	public String getGroupsOfCustomer() {
		return groupsOfCustomer;
	}

	public void setGroupsOfCustomer(String groupsOfCustomer) {
		this.groupsOfCustomer = groupsOfCustomer;
	}

	public String getTableOfSignals() {
		return tableOfSignals;
	}

	public void setTableOfSignals(String tableOfSignals) {
		this.tableOfSignals = tableOfSignals;
	}

	public String getTypeOfCommunicate() {
		return typeOfCommunicate;
	}

	public void setTypeOfCommunicate(String typeOfCommunicate) {
		this.typeOfCommunicate = typeOfCommunicate;
	}

	public String getBranchOrCodeOfAtm() {
		return branchOrCodeOfAtm;
	}

	public void setBranchOrCodeOfAtm(String branchOrCodeOfAtm) {
		this.branchOrCodeOfAtm = branchOrCodeOfAtm;
	}

	public String getIpOfSystem() {
		return ipOfSystem;
	}

	public void setIpOfSystem(String ipOfSystem) {
		this.ipOfSystem = ipOfSystem;
	}

	public String getMarkOfSystem() {
		return markOfSystem;
	}

	public void setMarkOfSystem(String markOfSystem) {
		this.markOfSystem = markOfSystem;
	}

	public String getModelOfSystem() {
		return modelOfSystem;
	}

	public void setModelOfSystem(String modelOfSystem) {
		this.modelOfSystem = modelOfSystem;
	}

	public Date getDateOfConnection() {
		return dateOfConnection;
	}

	public void setDateOfConnection(Date dateOfConnection) {
		this.dateOfConnection = dateOfConnection;
	}

	public Date getDateOfStarting() {
		return dateOfStarting;
	}

	public void setDateOfStarting(Date dateOfStarting) {
		this.dateOfStarting = dateOfStarting;
	}

	public Date getDateOfFinishing() {
		return dateOfFinishing;
	}

	public void setDateOfFinishing(Date dateOfFinishing) {
		this.dateOfFinishing = dateOfFinishing;
	}

	public String getSystemOfPhone() {
		return systemOfPhone;
	}

	public void setSystemOfPhone(String systemOfPhone) {
		this.systemOfPhone = systemOfPhone;
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

	public String getFaksNumber1() {
		return faksNumber1;
	}

	public void setFaksNumber1(String faksNumber1) {
		this.faksNumber1 = faksNumber1;
	}

	public String getFaksNumber2() {
		return faksNumber2;
	}

	public void setFaksNumber2(String faksNumber2) {
		this.faksNumber2 = faksNumber2;
	}

	public String getAtmBranchCode() {
		return atmBranchCode;
	}

	public void setAtmBranchCode(String atmBranchCode) {
		this.atmBranchCode = atmBranchCode;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getEmail3() {
		return email3;
	}

	public void setEmail3(String email3) {
		this.email3 = email3;
	}

	public String getEmail4() {
		return email4;
	}

	public void setEmail4(String email4) {
		this.email4 = email4;
	}

	public String getEmail5() {
		return email5;
	}

	public void setEmail5(String email5) {
		this.email5 = email5;
	}

	public String getSimCardNumber() {
		return simCardNumber;
	}

	public void setSimCardNumber(String simCardNumber) {
		this.simCardNumber = simCardNumber;
	}

	public String getNeighboorHood() {
		return neighboorHood;
	}

	public void setNeighboorHood(String neighboorHood) {
		this.neighboorHood = neighboorHood;
	}

	public String getAvenue() {
		return avenue;
	}

	public void setAvenue(String avenue) {
		this.avenue = avenue;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumberOfOutDoor() {
		return numberOfOutDoor;
	}

	public void setNumberOfOutDoor(String numberOfOutDoor) {
		this.numberOfOutDoor = numberOfOutDoor;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getCodeOfPost() {
		return codeOfPost;
	}

	public void setCodeOfPost(String codeOfPost) {
		this.codeOfPost = codeOfPost;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOccupationOfAccount() {
		return occupationOfAccount;
	}

	public void setOccupationOfAccount(String occupationOfAccount) {
		this.occupationOfAccount = occupationOfAccount;
	}

	public int getCodeOfAccount() {
		return codeOfAccount;
	}

	public void setCodeOfAccount(int codeOfAccount) {
		this.codeOfAccount = codeOfAccount;
	}
	
}

/*
 * Description:
 * --------------
 * This class contains details about customer and customer's device.
 * 
 * Parameters:
 * --------------
 * technicalServiceOrganisation: It's a company's name.
 * groupsOfCustomer: It's name of groups which customer depends on.
 * tableOfSignals: It' name of table that belongs to customer.
 * typeOfCommunicate: It's name of communication.
 * branchOrCodeOfAtm: It's private character of atm.
 * ipOfSystme: It's a ip of the system.
 * markOfSystem: It's mark of the system.
 * modelOfTheSystem: It's model of the system.
 * dateOfConnection: It's date of linking.
 * dateOfStarting: It's date of being customer.
 * dateOfFinishing: It's last date of being customer.
 * systemOfPhone: It's telephone number of the system.
 * phone1: It's phone of customer.
 * phone2: It's alternative phone number.
 * phone3: It's alternative phone number.
 * faksNumber1: It's the faks number;
 * faksNumber2: It's the alternative faks number.
 * atmBranchCode: It's code.
 * email1: It's mail of customer.
 * email2: It's alternative mail of customer.
 * email3: It's alternative mail of customer.
 * email4: It's alternative mail of customer.
 * email5: It's alternative mail of customer.
 * simCarNumber: It's sim card number;
 * neighboorHood: It's the name of one who is close family of our customer.
 * avenue: It's the name of avenue.
 * street: It's the name of street.
 * numberOfOutDoor: It's the number of door.
 * address1: It's the address of customer.
 * address2: It's the alternative address of custmer.
 * country: It's the country of customer.
 * city: It's the city of customer.
 * codePost: It's post code of customer.
 * location: It's location that customer have been.
 * occupationOfAccount: It's occupation of account.
 * 
 * 
 * Returns:
 * ------------
 * None
 *  */
