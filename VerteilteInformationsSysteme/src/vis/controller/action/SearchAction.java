package vis.controller.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.views.jsp.IfTag;

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
	private ProductManager productmanager;

	public String execute() {
		productmanager = new ProductManager();

		return "success";
	}

	private void dummyProducts() {
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
		this.products.addAll(this.productmanager.getAllProducts());

		if (!this.productname.isEmpty()) {
			List<Product> searchRes = new ArrayList<Product>();
			searchRes.add(this.productmanager
					.getProductByPrimaryKey(this.productname));
			this.products = this.replaceNotSame(searchRes, this.products);
		}

		if (!this.productdescription.isEmpty()) {
			List<Product> searchRes = productmanager
					.getProductsByDescription(this.productdescription);
			this.products = this.replaceNotSame(searchRes, this.products);
		}

		if (this.productpriceto > 0) {
			List<Product> searchRes = this.productmanager.getProductsByPrice(
					this.productpricefrom, this.productpriceto);
			this.products = this.replaceNotSame(searchRes, this.products);
			
		} else if (this.productpriceto == 0 && this.productpricefrom > 0) {
			
			List<Product> searchRes = this.productmanager
					.getProductByPriceFrom(this.productpricefrom);
			this.products = this.replaceNotSame(searchRes, this.products);
		}

		return this.products;
	}

	private List<Product> replaceNotSame(List<Product> list1,
			List<Product> list2) {

		List<Product> newList = new ArrayList<Product>();

		for (Iterator<Product> iteratorList1 = list1.iterator(); iteratorList1.hasNext();) {
			Product productList1 = (Product) iteratorList1.next();
			for (Iterator<Product> iteratorList2 = list2.iterator(); iteratorList2
					.hasNext();) {
				Product productList2 = (Product) iteratorList2.next();
				if (productList1.getName().equals(productList2.getName())) {
					newList.add(productList1);
				}
			}
		}

		return newList;
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
