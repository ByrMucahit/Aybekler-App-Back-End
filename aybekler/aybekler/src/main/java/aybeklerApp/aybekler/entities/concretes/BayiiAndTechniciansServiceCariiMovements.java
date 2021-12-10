package aybeklerApp.aybekler.entities.concretes;

import java.util.Date;

public class BayiiAndTechniciansServiceCariiMovements {
	
	/* Common Variables */
	private Date date;
	private String explanation;
	private int paid;
	private Date dateOfMaturity;
	private String b;
	private int debt;
	private int receivable;
	
	/* Constructor */
	public BayiiAndTechniciansServiceCariiMovements(Date date, String explanation, int paid, Date dateOfMaturity,
			String b, int debt, int receivable) {
		super();
		this.date = date;
		this.explanation = explanation;
		this.paid = paid;
		this.dateOfMaturity = dateOfMaturity;
		this.b = b;
		this.debt = debt;
		this.receivable = receivable;
	}
	
	/* Getter Setter */
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public int getPaid() {
		return paid;
	}

	public void setPaid(int paid) {
		this.paid = paid;
	}

	public Date getDateOfMaturity() {
		return dateOfMaturity;
	}

	public void setDateOfMaturity(Date dateOfMaturity) {
		this.dateOfMaturity = dateOfMaturity;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public int getDebt() {
		return debt;
	}

	public void setDebt(int debt) {
		this.debt = debt;
	}

	public int getReceivable() {
		return receivable;
	}

	public void setReceivable(int receivable) {
		this.receivable = receivable;
	}
}

/*
 * Description:
 * --------------
 * This class contains details of carii movements.
 * 
 * Parameters:
 * -------------
 * date: It's date of carii movements.
 * explanation: It's explanation about carii movements.
 * paid: It's payment.
 * dateOfMaturity: It's date of maturity.
 * b: It's unknown.
 * debt: It's debt of customer.
 * receivable: It's receivable.
 *
 * Returns:
 * ------------
 * None.
 *  
 *  */
