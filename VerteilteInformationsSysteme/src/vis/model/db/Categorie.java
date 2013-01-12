package vis.model.db;

import java.io.Serializable;

public class Categorie implements Serializable{

	private static final long serialVersionUID = 5061174140325765038L;

	private String name;
	private String description;
	
	public Categorie(){
		
	}
	
	public Categorie(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
