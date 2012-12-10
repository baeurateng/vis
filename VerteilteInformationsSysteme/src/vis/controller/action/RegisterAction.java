package vis.controller.action;

import com.opensymphony.xwork2.ActionSupport;

import vis.model.bl.CustomerManager;
import vis.model.db.Customer;

public class RegisterAction extends ActionSupport{

	private static final long serialVersionUID = -3733931177436484070L;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private boolean isSuperUser;
	
	public String execute() {
		
		Customer customer = new Customer(this.getFirstname(),
				this.getLastname(), this.getEmail(), this.getPassword(),
				this.isSuperUser());
		CustomerManager customerManager = new CustomerManager();
		customerManager.saveCustomer(customer);
		
		return "success";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
}
