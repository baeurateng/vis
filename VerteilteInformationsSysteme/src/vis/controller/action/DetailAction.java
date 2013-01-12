package vis.controller.action;

import vis.model.bl.ProductManager;
import vis.model.db.Product;

import com.opensymphony.xwork2.ActionSupport;

public class DetailAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5050820769472371720L;
	private String name;
	private Product product;
	
	public String execute(){
		ProductManager productmanager = new ProductManager();
		product = productmanager.getProductByPrimaryKey(this.name);
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
