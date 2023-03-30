package Loan.example.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table
public class Loans {
	
	@Id
	@Column(name = "loan_number")
	@GeneratedValue(strategy =GenerationType.AUTO)	
	private int loanNumber;
	
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name ="loan_type")
	private String loanType;
	
	@Column(name ="loan_amount")
	private int loanAmt;
	
	@Column(name = "loan_end_date")
	private Date loanEndDate;

	public int getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public int getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(int loanAmt) {
		this.loanAmt = loanAmt;
	}

	public Date getLoanEndDate() {
		return loanEndDate;
	}

	public void setLoanEndDate(Date loanEndDate) {
		this.loanEndDate = loanEndDate;
	}					
	
}