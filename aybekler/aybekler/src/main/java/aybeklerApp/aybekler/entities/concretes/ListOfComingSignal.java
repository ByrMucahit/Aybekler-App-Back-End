package aybeklerApp.aybekler.entities.concretes;

import java.util.Date;

public class ListOfComingSignal {
	
	/* Common variables */
	private Date dates;
	private String device;
	private String codeOfAlert;
	private String regionOfUser;
	private String message;
	private String operator;
	private String noteOfOperator;
	
	/* Constructors */
	public ListOfComingSignal(Date dates, String device, String codeOfAlert, String regionOfUser, 
			                  String message, String operator, String noteOfOperator) {
		super();
		this.dates = dates;
		this.device = device;
		this.codeOfAlert = codeOfAlert;
		this.regionOfUser = regionOfUser;
		this.message = message;
		this.operator = operator;
		this.noteOfOperator = noteOfOperator;
	}

	public Date getDates() {
		return dates;
	}

	public void setDates(Date dates) {
		this.dates = dates;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getCodeOfAlert() {
		return codeOfAlert;
	}

	public void setCodeOfAlert(String codeOfAlert) {
		this.codeOfAlert = codeOfAlert;
	}

	public String getRegionOfUser() {
		return regionOfUser;
	}

	public void setRegionOfUser(String regionOfUser) {
		this.regionOfUser = regionOfUser;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getNoteOfOperator() {
		return noteOfOperator;
	}

	public void setNoteOfOperator(String noteOfOperator) {
		this.noteOfOperator = noteOfOperator;
	}
	
}

/*
 * Description:
 * --------------
 * This class contains the details about Signals;
 * 
 * Parameters:
 * -------------
 * dates: It's date of coming signals.
 * device: It's the name of device.
 * codeOfAlert: Alert All have single and individual code that's like id. This variable keeps code of alert.
 * regionOfUser: It's detail of region where customer have been.
 * message: It's message.
 * operator: It's name of repairman who have fixed problems in releated region.
 * noteOfOperator: It's notes that repair man have written, it contains detail which is need to be addition while fixing problems. 
 * 
 * Returns:
 * -------------
 * None
 * */
