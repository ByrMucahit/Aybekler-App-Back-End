package aybeklerApp.aybekler.entities.concretes;

public class FooterTableSiganlsSystemUser {

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
	
	/* Constructor  */
	public FooterTableSiganlsSystemUser(int orderOfPanel, String fullName, String task, int registerNumber,
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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
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
 * Description:
 * --------------
 * It's details of releated customer, also it includes information about device.
 * 
 * Parameters:
 * -------------
 * orderOfPanel: It's order expression that the Panel is passed sequentially and individually.
 * fullName: It's the name of customer.
 * task: It's task which the customer works on.
 * registerNumber: It's number that's expressed as id in the system.
 * family: It's details of  The one who is being close family of our customer.
 * phone1: It's telephone number of our customer.
 * phone2: It's alternative number, If we cannot reach with phone.
 * phone3: It's alternative number, If we cannot reach with phone.
 * phone4: It's alternative number, If we cannot reach with phone.
 * alert: It's a device.
 *
 * Returns:
 * --------------
 * None
 * */
