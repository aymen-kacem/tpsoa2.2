package ex2;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Compte {
	int code;
	int solde;
	Date dateCreation;
	public Compte(int code,int solde,Date date) {
		this.code=code;
	    this.solde=solde;
		this.dateCreation=date;
	}
	public void setcode(int code) {
		this.code=code;
	}
	
	public int getcode() {
		return this.code;
	}
	public void setsolde(int solde) {
		this.solde=solde;
	}
	public int getsolde() {
		return this.solde;
	}
	public void setdate(Date date) {
		this.dateCreation=date;
	}
	public Date getdate() {
		return this.dateCreation;
	}
	
	
}
