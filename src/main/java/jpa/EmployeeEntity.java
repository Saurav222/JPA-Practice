package jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class EmployeeEntity {
	
	public AccountEntity getAccount() {
		return account;
	}
	public void setAccount(AccountEntity account) {
		this.account = account;
	}
//	@Id
//	@GeneratedValue(strategy= GenerationType.IDENTITY)
//	private int employee_ID;
	
//one to one mapping with foreign key association
//	@OneToOne
//	@JoinColumn(name="account_id")
//	private AccountEntity account;
	
	
	@Id
	private int employee_ID;
	@OneToOne
	@MapsId
	private AccountEntity account;
	
	
//one to one mapping with common join table	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinTable(name="EMPLOYEE_ACCCOUNT", joinColumns = @JoinColumn(name="employee_ID"),
//	inverseJoinColumns = @JoinColumn(name="account_id"))
	//private AccountEntity account;
	
	private String email;
	private String first_name;
	private String last_name;
	
	
	
	public int getEmployee_ID() {
		return employee_ID;
	}
	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
	

}
