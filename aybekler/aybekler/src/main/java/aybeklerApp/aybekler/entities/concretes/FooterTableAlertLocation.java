package aybeklerApp.aybekler.entities.concretes;

public class FooterTableAlertLocation {

	/* Common Variables */
	private int numberOfLocation;
	private String explanationOfLocation;
	private String typeOfDedector;
	
	/* Constructors */
	public FooterTableAlertLocation(int numberOfLocation, String explanationOfLocation, String typeOfDedector) {
		super();
		this.numberOfLocation = numberOfLocation;
		this.explanationOfLocation = explanationOfLocation;
		this.typeOfDedector = typeOfDedector;
	}

	public int getNumberOfLocation() {
		return numberOfLocation;
	}

	public void setNumberOfLocation(int numberOfLocation) {
		this.numberOfLocation = numberOfLocation;
	}

	public String getExplanationOfLocation() {
		return explanationOfLocation;
	}

	public void setExplanationOfLocation(String explanationOfLocation) {
		this.explanationOfLocation = explanationOfLocation;
	}

	public String getTypeOfDedector() {
		return typeOfDedector;
	}

	public void setTypeOfDedector(String typeOfDedector) {
		this.typeOfDedector = typeOfDedector;
	}
	
}

/*
 * Description:
 * -------------
 * It's details of region and device. Location All have individual number to identify. All information in system're going to be seen
 * as integer numbers.
 * 
 * Parameters:
 * -------------
 * numberOfLocation: It's a integer value that expressed identification of location.
 * explanationOfLocation: It's explanation about location.
 * typeOfDedector: It's a type of dedector.
 * 
 * Returns:
 * -------------
 * None
 * 	
	*/