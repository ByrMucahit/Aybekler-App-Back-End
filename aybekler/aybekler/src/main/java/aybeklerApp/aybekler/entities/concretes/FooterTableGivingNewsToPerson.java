package aybeklerApp.aybekler.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="footertablegivingnewsperson")
@AllArgsConstructor
@NoArgsConstructor
public class FooterTableGivingNewsToPerson {
	
	/* Common variables */
	@Id
	@Column(name="id_of_account")
	private int idOfAccount;
	
	@Column(name="calling_order")
	private int orderOfPanel;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="task")
	private String task;
	
	@Column(name="register_number")
	private int registerNumber;
	
	@Column(name="closer_family")
	private String family;
	
	@Column(name="phone1")
	private String phone1;
	
	@Column(name="phone2")
	private String phone2;
	
	@Column(name="phone3")
	private String phone3;
	
	@Column(name="phone4")
	private String phone4;
	
	@Column(name="alerts")
	private String alert;
	
	public FooterTableGivingNewsToPerson() {
		
	}
	
	/* Constructor */
	public FooterTableGivingNewsToPerson(int orderOfPanel, String fullName, String task, int registerNumber,
			String family, String phone1, String phone2, String phone3, String phone4, String alert, int idOfAccount) {
		super();
		this.orderOfPanel = orderOfPanel;
		this.fullName = fullName;
		this.task = task;
		this.registerNumber = registerNumber;
		this.family = family;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.phone4 = phone4;
		this.alert = alert;
		this.idOfAccount = idOfAccount;
	}

	public int getOrderOfPanel() {
		return orderOfPanel;
	}

	public void setOrderOfPanel(int orderOfPanel) {
		this.orderOfPanel = orderOfPanel;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(int registerNumber) {
		this.registerNumber = registerNumber;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
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

	public String getPhone4() {
		return phone4;
	}

	public void setPhone4(String phone4) {
		this.phone4 = phone4;
	}

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	public int getIdOfAccount() {
		return idOfAccount;
	}

	public void setIdOfAccount(int idOfAccount) {
		this.idOfAccount = idOfAccount;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
}

/* 
 * Description :
 * ---------------
 * It's a details about the device and Customer Who has its device purchases.
 * 
 * Parameters:
 * --------------
 * orderOfPanel: It's integer value that expressed order that device has.
 * fullName: It's the name of customer.
 * task: It's a problem the customer has.
 * registerNumber: It's such as id that is passed into the individual person.
 * family: It's a detail about one who should be family of our customer for communication.
 * phone1: It's a phone number of the customer.
 * phone2: Alternative phone number
 * phone3: Alternative phone number
 * phone4: Alternative phone number
 * alert: It's the device.
 * 	this.orderOfPanel = orderOfPanel;
 * 
 * Return:
 * --------------
 * None
 * */
