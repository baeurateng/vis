package vis.controller.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import vis.model.bl.ProductManager;
import vis.model.db.Product;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6655918733115013260L;
	private String productname;
	private String productdescription;
	private double productpricefrom;
	private double productpriceto;
	private List<Product> products;
	
	public String execute() {
		ProductManager productmanager = new ProductManager();
		products = productmanager.getAllProducts();
		
		return "success";
	}
	
	private void dummyProducts(){
		Product p1 = new Product();
		p1.setDescription("Socken");
		p1.setName("Produkt1");
		p1.setPrice(50);
		
		Product p2 = new Product();
		p2.setDescription("Coole Hose mit Fleck");
		p2.setName("Produkt2");
		p2.setPrice(70);
		
		Product p3 = new Product();
		p3.setDescription("Schockoriegel");
		p3.setName("Produkt3");
		p3.setPrice(2.50);
		
		this.products.add(p1);
		this.products.add(p2);
		this.products.add(p3);
		
	}
	
	public List<Product> getProducts() {
		
		this.products = new ArrayList<Product>();
		this.dummyProducts();
		
		List<Product> searchedProducts = new ArrayList<Product>();
		
		for (Iterator<Product> iterator = this.products.iterator(); iterator
				.hasNext();) {
			Product product = (Product) iterator.next();
			
			if (product.getName().equals(this.productname)) {
				searchedProducts.add(product);
			} else if (product.getDescription().contains(this.productdescription)) {
				searchedProducts.add(product);
			} else if (product.getPrice() >= this.productpricefrom && product.getPrice() <= this.productpriceto ) {
				searchedProducts.add(product);
			}
			
		}
		
		return searchedProducts;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	public double getProductpricefrom() {
		return productpricefrom;
	}
	public void setProductpricefrom(double productpricefrom) {
		this.productpricefrom = productpricefrom;
	}
	public double getProductpriceto() {
		return productpriceto;
	}
	public void setProductpriceto(double productpriceto) {
		this.productpriceto = productpriceto;
	}
}
