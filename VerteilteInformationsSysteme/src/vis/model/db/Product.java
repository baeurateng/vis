package vis.model.db;

import java.io.Serializable;

public class Product implements Serializable{

	private static final long serialVersionUID = -8931597858749838079L;
	private String name;
	private double price;
	private String description;
	private Categorie categorie;
	
	public Product(){
		
	}
	
	public Product(String name, String description, double price,
			Categorie categorie) {
		this.setName(name);
		this.setDescription(description);
		this.setPrice(price);
		this.setCategorie(categorie);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Categorie getCategorie() {
		return categorie;
	}
	
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
