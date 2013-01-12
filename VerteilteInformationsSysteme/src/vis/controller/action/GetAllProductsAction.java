package vis.controller.action;

import java.util.ArrayList;
import java.util.List;

import vis.model.bl.CategorieManager;
import vis.model.bl.ProductManager;
import vis.model.db.Categorie;
import vis.model.db.Product;

import com.opensymphony.xwork2.ActionSupport;

public class GetAllProductsAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3245269334934284550L;
	private List<Product> products;
	private List<Categorie> categories;
	
	public String execute(){
		ProductManager productmanager = new ProductManager();
		products = productmanager.getAllProducts();
		
		CategorieManager categoriemanager = new CategorieManager();
//		categories = categoriemanager.getAllCategoires();
		categories = new ArrayList<Categorie>();
		
		if (products != null) {
			return SUCCESS;
		}
		
		return INPUT;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Categorie> getCategories() {
		return categories;
	}

	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}
	
}
