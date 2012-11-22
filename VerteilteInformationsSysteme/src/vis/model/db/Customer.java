package vis.model.db;

import java.io.Serializable;

public class Customer  implements Serializable{

	private static final long serialVersionUID = -5513678738309831733L;
	private String firstname;
	private String lastname;
	private String eMail;
	private String passwort;
	private boolean isSuperUser;
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
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
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