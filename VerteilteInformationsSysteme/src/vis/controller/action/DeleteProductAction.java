package vis.controller.action;

import java.util.List;

import vis.model.bl.CategorieManager;
import vis.model.bl.ProductManager;
import vis.model.db.Categorie;
import vis.model.db.Product;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteProductAction extends ActionSupport{

	private static final long serialVersionUID = -7742690496208539905L;
	private String name;
	private List<Product> products;
	private List<Categorie> categories;
	
	public String execute(){
		ProductManager pm = new ProductManager();
		CategorieManager cm = new CategorieManager();
		
		pm.deleteProductByPrimaryKey(this.getName());
		
		setProducts(pm.getAllProducts());
		setCategories(cm.getAllCategoires());
		
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
