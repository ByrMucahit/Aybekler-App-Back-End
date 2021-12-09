package aybeklerApp.aybekler.entities.concretes;

import java.util.Date;

public class FooterTableSignals {

	private Date date ;
	private String device;
	private String codeOfAlert;
	private String location;
	private String message;
	private String operator;
	private String note;
	
	public FooterTableSignals(Date date, String device, String codeOfAlert, String location, String message,
			String operator, String note) {
		super();
		this.date = date;
		this.device = device;
		this.codeOfAlert = codeOfAlert;
		this.location = location;
		this.message = message;
		this.operator = operator;
		this.note = note;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
}

/*
 *Description:
 *---------------
 * It's a tables from home page . It contains detail of releated signals. 
 * 
 * Parameters:
 * --------------
 * date: It's date of coming signals.
 * device: It's device that send signals
 * codeOfAlert: All devices have private code. It's expression of its code.
 * location: It's location where signals come from.
 * message: It's message that customer can write.
 * operator: It's repairman.
 * note: It's note rapairman can write that any situation that it is needed.
 * 
 * Return:
 * -------------
 * None
*/