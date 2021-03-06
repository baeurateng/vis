package vis.model.db;

import java.io.Serializable;

public class Customer  implements Serializable{

	private static final long serialVersionUID = -5513678738309831733L;
	private String firstname;
	private String lastname;
	private String eMail;
	private String password;
	private boolean isSuperUser;
	
	public Customer(){
		
	}
	
	public Customer(String firstname, String lastname, String eMail, String password, boolean isSuperUser){
		this.firstname = firstname;
		this.lastname = lastname;
		this.eMail = eMail;
		this.password = password;
		this.isSuperUser = isSuperUser;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isSuperUser() {
		return isSuperUser;
	}
	public void setSuperUser(boolean isSuperUser) {
		this.isSuperUser = isSuperUser;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}