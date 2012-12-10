package vis.controller.action;

import vis.model.db.Customer;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username = null;
	private String password = null;
	private String firstname = "";
	private String lastname = "";
	
	public String execute(){
		Customer dbUser = new Customer("a", "b", "c", "d", false);
		
		dbUser.seteMail("a");
		dbUser.setPassword("a");
		
		if (dbUser.geteMail().equals(getUsername())) {
		
			if (dbUser.getPassword().equals(getPassword())) {
	
				setFirstname(dbUser.getFirstname());
				setLastname(dbUser.getLastname());
				
				return SUCCESS;
	
			} else {
				addActionError(getText("error.user.passwordforgotten"));
				addActionError("Bitte geben Sie das richtige Passwort ein!");
				return INPUT;
			}
		}
		else {
			addFieldError("username", getText("error.username.register"));
			 return INPUT;
		}
	}
	
	public String register(){
		return "register";
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

}
