package aybeklerApp.aybekler.entities.concretes;

import java.util.Date;

public class OpeningClosingCard {

	/* Common Variables */
	private Date day;
	private String hourOfOpening;
	private String hourOfClosing;
	private boolean allClosing;
	private String hourOfInstallingStarting;
	private String hourOfInstallingClosing;
	private String lateOpeningTolerance;
	private String lateClosingTolerance;
	private String messageCommunicateTolerance;
	
	/* Constructor */
	public OpeningClosingCard(Date day, String hourOfOpening, String hourOfClosing, boolean allClosing,
			String hourOfInstallingStarting, String hourOfInstallingClosing, String lateOpeningTolerance,
			String lateClosingTolerance, String messageCommunicateTolerance) {
		super();
		this.day = day;
		this.hourOfOpening = hourOfOpening;
		this.hourOfClosing = hourOfClosing;
		this.allClosing = allClosing;
		this.hourOfInstallingStarting = hourOfInstallingStarting;
		this.hourOfInstallingClosing = hourOfInstallingClosing;
		this.lateOpeningTolerance = lateOpeningTolerance;
		this.lateClosingTolerance = lateClosingTolerance;
		this.messageCommunicateTolerance = messageCommunicateTolerance;
	}
	
	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public String getHourOfOpening() {
		return hourOfOpening;
	}

	public void setHourOfOpening(String hourOfOpening) {
		this.hourOfOpening = hourOfOpening;
	}

	public String getHourOfClosing() {
		return hourOfClosing;
	}

	public void setHourOfClosing(String hourOfClosing) {
		this.hourOfClosing = hourOfClosing;
	}

	public boolean isAllClosing() {
		return allClosing;
	}

	public void setAllClosing(boolean allClosing) {
		this.allClosing = allClosing;
	}

	public String getHourOfInstallingStarting() {
		return hourOfInstallingStarting;
	}

	public void setHourOfInstallingStarting(String hourOfInstallingStarting) {
		this.hourOfInstallingStarting = hourOfInstallingStarting;
	}

	public String getHourOfInstallingClosing() {
		return hourOfInstallingClosing;
	}

	public void setHourOfInstallingClosing(String hourOfInstallingClosing) {
		this.hourOfInstallingClosing = hourOfInstallingClosing;
	}

	public String getLateOpeningTolerance() {
		return lateOpeningTolerance;
	}

	public void setLateOpeningTolerance(String lateOpeningTolerance) {
		this.lateOpeningTolerance = lateOpeningTolerance;
	}

	public String getLateClosingTolerance() {
		return lateClosingTolerance;
	}

	public void setLateClosingTolerance(String lateClosingTolerance) {
		this.lateClosingTolerance = lateClosingTolerance;
	}

	public String getMessageCommunicateTolerance() {
		return messageCommunicateTolerance;
	}

	public void setMessageCommunicateTolerance(String messageCommunicateTolerance) {
		this.messageCommunicateTolerance = messageCommunicateTolerance;
	}
}

/*
 * Description:
 * --------------
 * This class contains detail about hour of process;
 * 
 * Parameters:
 * -------------
 * day: It's the saved day.
 * hourOfOpening: It's the hour of device opening.
 * hourOfClosing: It's the hour of device closing.
 * allClosing: It's the boolean value that checks all device close.
 * hourOfInstallingStarting: It's the hour of start of installing.
 * hourOfInstallingClosing: It's the hour of finish of installing.
 * lateOpeningTolerance: It's the potential opening late tolerance.
 * lateClosingTolerance: It's the potential closing late tolerance.
 * messageCommunicateTolerance: It's the potential tolerance of communication.
 *
 * Returns:
 * -------------  
 *  None
 *  */
