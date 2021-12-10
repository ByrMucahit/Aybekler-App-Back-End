package aybeklerApp.aybekler.entities.concretes;

import java.util.Date;

public class TakingTechnichService {

	/* Common Variabes */
	private String techniciansServiceNotes;
	private Date times;

	
	/* Constructors */
	public TakingTechnichService(String techniciansServiceNotes, Date times) {
		super();
		this.techniciansServiceNotes = techniciansServiceNotes;
		this.times = times;
	}


	public String getTechniciansServiceNotes() {
		return techniciansServiceNotes;
	}


	public void setTechniciansServiceNotes(String techniciansServiceNotes) {
		this.techniciansServiceNotes = techniciansServiceNotes;
	}


	public Date getTimes() {
		return times;
	}


	public void setTimes(Date times) {
		this.times = times;
	}
	
}

/*
 * Description:
 * ---------------
 * This class contains detail of device that taken service.
 * 
 * Parameters:
 * ---------------
 * techniciansServiceNotes: It's notes of repairman.
 * times: It's the hour of fixed problem.
 * 
 * Returns:
 * ---------------
 * None
 * */
