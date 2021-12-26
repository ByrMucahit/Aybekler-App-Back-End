package aybeklerApp.aybekler.entities.dtos;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="allaccountsignals")
@AllArgsConstructor
@NoArgsConstructor
public class AllAccountSignalsDto {
	@Id
	@Column(name="code_of_account")
	private int codeOfAccount;
	
	@Column(name="number_of_part")
	private int numberOfPart;
	
	@Column(name="name_of_organisation")
	private String nameOfOrganisation;
	
	@Column(name="device")
	private String device;
	
	@Column(name="code_of_alert")
	private String codeOfAlert;
	
	@Column(name="location_or_user")
	private String region;
	
	@Column(name="messages")
	private String message;
	
	@Column(name="operators")
	private String operator;
	
	@Column(name="occupation")
	private String occupation;
	
	@Column(name="periods")
	private String period;
	
	@Column(name="dates")
	private String dates;
	
	@Column(name="times")
	private String times;

	public AllAccountSignalsDto() {
		
	}
	
	/* Constructor */
	public AllAccountSignalsDto(int codeOfAccount, int numberOfPart, String nameOfOrganisation, String device, String dates,
			String codeOfAlert, String region, String message, String operator, String occupation, String period, String times) {
		super();
		this.codeOfAccount = codeOfAccount;
		this.numberOfPart = numberOfPart;
		this.nameOfOrganisation = nameOfOrganisation;
		this.device = device;
		this.codeOfAlert = codeOfAlert;
		this.region = region;
		this.message = message;
		this.operator = operator;
		this.occupation = occupation;
		this.period = period;
		this.dates = dates;
		this.times = times;
	}


	public int getCodeOfAccount() {
		return codeOfAccount;
	}


	public void setCodeOfAccount(int codeOfAccount) {
		this.codeOfAccount = codeOfAccount;
	}


	public int getNumberOfPart() {
		return numberOfPart;
	}


	public void setNumberOfPart(int numberOfPart) {
		this.numberOfPart = numberOfPart;
	}


	public String getNameOfOrganisation() {
		return nameOfOrganisation;
	}


	public void setNameOfOrganisation(String nameOfOrganisation) {
		this.nameOfOrganisation = nameOfOrganisation;
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


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
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
	
	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public String getPeriod() {
		return period;
	}


	public void setPeriod(String period) {
		this.period = period;
	}

	public String getDates() {
		return dates;
	}

	public void setDates(String dates) {
		this.dates = dates;
	}

	public String getTimes() {
		return times;
	}

	public void setTimes(String times) {
		this.times = times;
	}

}
