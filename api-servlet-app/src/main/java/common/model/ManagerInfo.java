package common.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity(name="managerinfo")
public class ManagerInfo implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name="id_generator", sequenceName = "mangaerinfo_id_seq", allocationSize = 1)
	private int id;

	@Column
	private String fname ;
	
	@Column
	private String lname;
	
	@Column
	private String email;
	
	@Column
	private String phone;
	
	@Column 
	private String role;
	
	@Column
	private int managerId;
	
	@Column
	private Date begindate;

	public ManagerInfo() {
		super();
	}
	
	public ManagerInfo(String fname,String lname,String email,String phone, String role,int managerId,Date begindate) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.role = role;
		this.managerId = managerId;
		this.begindate = begindate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String reason) {
		this.fname = fname;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public Date getBegindate() {
		return begindate;
	}

	public void setBegindate(Date begindate) {
		this.begindate = begindate;
	}

	public String getLname() {
		return lname;
	}
	

	public void setLname(String lname) {
		this.lname = lname ;
	}


	@Override
	public String toString() {
		return "[" + this.fname + "," + this.lname+ "," + this.email + "," + this.phone+ "," + this.managerId + ","
				+ "" + this.role+ "," + this.begindate+ "]";
	}
}
