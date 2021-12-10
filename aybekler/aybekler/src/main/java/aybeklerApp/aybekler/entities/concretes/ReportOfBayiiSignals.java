package aybeklerApp.aybekler.entities.concretes;

import java.util.Date;

public class ReportOfBayiiSignals {
	
	/* Common Variables */
	private String accountK;
	private int numberOfDepartment;
	private String re;
	private String telephone;
	private String nameOfAccount;
	private Date dateOfSignals;
	private String al;
	private String location;
	private String si;
	private String typeOfSignals;
	private String noteOfOperator;
	private String de;
	
	/* Constructor */
	public ReportOfBayiiSignals(String accountK, int numberOfDepartment, String re, String telephone,
			String nameOfAccount, Date dateOfSignals, String al, String location, String si, String typeOfSignals,
			String noteOfOperator, String de) {
		super();
		this.accountK = accountK;
		this.numberOfDepartment = numberOfDepartment;
		this.re = re;
		this.telephone = telephone;
		this.nameOfAccount = nameOfAccount;
		this.dateOfSignals = dateOfSignals;
		this.al = al;
		this.location = location;
		this.si = si;
		this.typeOfSignals = typeOfSignals;
		this.noteOfOperator = noteOfOperator;
		this.de = de;
	}
	
	/* Getter Setter */
	public String getAccountK() {
		return accountK;
	}

	public void setAccountK(String accountK) {
		this.accountK = accountK;
	}

	public int getNumberOfDepartment() {
		return numberOfDepartment;
	}

	public void setNumberOfDepartment(int numberOfDepartment) {
		this.numberOfDepartment = numberOfDepartment;
	}

	public String getRe() {
		return re;
	}

	public void setRe(String re) {
		this.re = re;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getNameOfAccount() {
		return nameOfAccount;
	}

	public void setNameOfAccount(String nameOfAccount) {
		this.nameOfAccount = nameOfAccount;
	}

	public Date getDateOfSignals() {
		return dateOfSignals;
	}

	public void setDateOfSignals(Date dateOfSignals) {
		this.dateOfSignals = dateOfSignals;
	}

	public String getAl() {
		return al;
	}

	public void setAl(String al) {
		this.al = al;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSi() {
		return si;
	}

	public void setSi(String si) {
		this.si = si;
	}

	public String getTypeOfSignals() {
		return typeOfSignals;
	}

	public void setTypeOfSignals(String typeOfSignals) {
		this.typeOfSignals = typeOfSignals;
	}

	public String getNoteOfOperator() {
		return noteOfOperator;
	}

	public void setNoteOfOperator(String noteOfOperator) {
		this.noteOfOperator = noteOfOperator;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}
}

/*
 * Description:
 * --------------
 * This class contains details of report about signals.
 * 
 * Parameters:
 * --------------
 * accountK: It's unknown
 * numberOfDepartment: It's number of department.
 * telephone: It's phone number of customer.
 * re: It's unknown
 * nameOfAccount: It's name of customer.
 * dateOfSignals: It's date of signals.
 * al: It's unknown.
 * location: It's location where customer have been.
 * si: It's unknown.
 * typeOfSignals: It's type of signals.
 * noteOfOperator: It's notes of operator.
 * de: It's unknown.
 *
 * Return:
 * --------------
 * None
 * */
