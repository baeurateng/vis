package vis.controller.action;

import java.util.List;

import vis.model.bl.CategorieManager;
import vis.model.db.Categorie;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteCategorieAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 993905240928852799L;
	private String name;
	private String description;
	private List<Categorie> categories;
	
	public String execute(){
		
		CategorieManager cm = new CategorieManager();
		
		try {
			cm.deleteCategorieByPrimaryKey(this.getName());
		} catch (Exception e) {
			System.out.println(getText("error.categorie.used"));
			System.exit(0);
		}
		
		System.out.println(this.getName());
		categories = cm.getAllCategoires();
		
		this.setName("");
		
		return SUCCESS;
	}
	
	public List<Categorie> getCategories() {
		return categories;
	}
	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}