package aybeklerApp.aybekler.entities.concretes;

public class FooterTableGivingNewsToPerson {
	
	/* Common variables */
	private int orderOfPanel;
	private String fullName;
	private String task;
	private int registerNumber;
	private String family;
	private String phone1;
	private String phone2;
	private String phone3;
	private String phone4;
	private String alert;
	
	/* Constructor */
	public FooterTableGivingNewsToPerson(int orderOfPanel, String fullName, String task, int registerNumber,
			String family, String phone1, String phone2, String phone3, String phone4, String alert) {
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
	}

	public int getOrderOfPanel() {
		return orderOfPanel;
	}

	public void setOrderOfPanel(int orderOfPanel) {
		this.orderOfPanel = orderOfPanel;
	}

	public String getfullName() {
		return fullName;
	}

	public void setfullName(String fullName) {
		this.fullName = fullName;
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
