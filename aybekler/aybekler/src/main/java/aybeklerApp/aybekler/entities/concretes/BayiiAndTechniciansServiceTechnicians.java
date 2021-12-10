package aybeklerApp.aybekler.entities.concretes;

public class BayiiAndTechniciansServiceTechnicians {
	
	/* Common Variables */
	private int priortiyOrder;
	private String fullName;
	private String task;
	private String closer;
	private String phone1;
	private String phone2;
	private String phone3;
	private String phone4;
	private String password;
	
	/* Constructor */
	public BayiiAndTechniciansServiceTechnicians(int priortiyOrder, String fullName, String task, String closer,
			String phone1, String phone2, String phone3, String phone4, String password) {
		super();
		this.priortiyOrder = priortiyOrder;
		this.fullName = fullName;
		this.task = task;
		this.closer = closer;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.phone4 = phone4;
		this.password = password;
	}
	
	/* Getter Setter */
	public int getPriortiyOrder() {
		return priortiyOrder;
	}

	public void setPriortiyOrder(int priortiyOrder) {
		this.priortiyOrder = priortiyOrder;
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

	public String getCloser() {
		return closer;
	}

	public void setCloser(String closer) {
		this.closer = closer;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}


/*
 * Description:
 * --------------
 * This class contains details about technicians.
 * 
 * Parameters:
 * -------------
 * priorityOrder: It's the order of priority;
 * task: It' the task of technicians.
 * closer: It's expressed the one who is closer family of technicians.
 * phone1: It's the main phone of technicians.
 * phone2: It's the alternative phone of.technicians. 
 * phone3: It's the alternative phone of.technicians. 
 * phone4: It's the alternative phone of.technicians. 
 * password: It's the password of technicians.
 *
 * Returns:
 * -------------
 * None
 *  */
 