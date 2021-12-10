package aybeklerApp.aybekler.entities.concretes;

import java.util.Date;

public class ServiceAccount {
	
	/* Common Variables */
	private Date date;
	private String detail;
	private String result;

	/* Constructors */
	public ServiceAccount(Date date, String detail, String result) {
		super();
		this.date = date;
		this.detail = detail;
		this.result = result;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
}

/*
 * Description:
 * --------------
 * This class contains each service of account.
 * 
 * Parameters:
 * --------------
 * date: It's the date of service;
 * detail: It's the details about releated service.
 * result: It's the result of service.
 *
 * Returns:
 * --------------
 * None
 * 
 *  */
