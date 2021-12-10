package aybeklerApp.aybekler.entities.concretes;

import java.util.Date;

public class DayOff {

	/* Common Varaibles */
	private String explanation;
	private Date dateOfEnding;
	private Date dateOfBegining;
	
	/* Constructor */
	public DayOff(String explanation, Date dateOfEnding, Date dateOfBegining) {
		super();
		this.explanation = explanation;
		this.dateOfEnding = dateOfEnding;
		this.dateOfBegining = dateOfBegining;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public Date getDateOfEnding() {
		return dateOfEnding;
	}

	public void setDateOfEnding(Date dateOfEnding) {
		this.dateOfEnding = dateOfEnding;
	}

	public Date getDateOfBegining() {
		return dateOfBegining;
	}

	public void setDateOfBegining(Date dateOfBegining) {
		this.dateOfBegining = dateOfBegining;
	}
	
}

/*
 * Description:
 * --------------
 * This class contains details about rest day.
 * 
 * Parameters:
 * --------------
 * Explanation: It's explanation about rest day.
 * dateOfEnding: It's date of rest day finishing.
 * dateOfBeginning: It2s date of rest day starting.
 * 
 * Returns:
 * -------------
 * None
 * */
