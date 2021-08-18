package common.model;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity(name="reasons")
public class Reasons implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name="id_generator", sequenceName = "reasons_id_seq", allocationSize = 1)
	private int id;

	@Column
	private String reason;
	
	@Column
	private double amount;
	
	@Column
	private Date time;

	public Reasons() {
		super();
	}
	
	public Reasons(String reason,double amount, Date time) {
		super();
		this.reason = reason;
		this.amount = amount;
		this.time = time;
		
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	

	public double getAmount() {
		return amount;
	}
	

	public void setAmount(double amount) {
		this.amount = amount ;
	}


	@Override
	public String toString() {
		return "[" + this.reason + "," + this.amount+ "]";
	}
}
