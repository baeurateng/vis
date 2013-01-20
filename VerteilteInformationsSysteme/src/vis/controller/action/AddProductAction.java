package vis.controller.action;

import java.util.ArrayList;
import java.util.List;

import vis.model.bl.CategorieManager;
import vis.model.bl.ProductManager;
import vis.model.db.Categorie;
import vis.model.db.Product;

import com.opensymphony.xwork2.ActionSupport;

public class AddProductAction extends ActionSupport{

	private static final long serialVersionUID = 3806345191742975667L;
	private String productname;
	private String productprice;
	private String productdescription;
	private List<Product> products;
	private List<Categorie> categories = new ArrayList<Categorie>();;
	private String categoriename;
	
	public AddProductAction(){
		CategorieManager cm = new CategorieManager();
		categories = cm.getAllCategoires();
	}
	
	public String execute(){
		ProductManager pm = new ProductManager();
		CategorieManager cm = new CategorieManager();
		
		if(!this.getProductname().isEmpty() 
				&& !this.getProductprice().isEmpty()
				&& !this.getProductdescription().isEmpty() 
				&& !this.getCategoriename().isEmpty()
				){
			
			double realProductPrice = Double.valueOf(this.getProductprice());
			Product product = new Product(this.getProductname(), this.getProductdescription(),realProductPrice,cm.getCategorieByPrimaryKey(this.getCategoriename()));
			pm.saveProduct(product);
			
			this.categories = cm.getAllCategoires();
			
			this.products = pm.getAllProducts();
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

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductprice() {
		return productprice;
	}

	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}

	public String getProductdescription() {
		return productdescription;
	}

	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

	public String getCategoriename() {
		return this.categoriename;
	}

	public void setCategoriename(String categoriename) {
		this.categoriename = categoriename;
	}
}
