package vis.controller.action;

import java.util.List;

import vis.model.bl.CategorieManager;
import vis.model.db.Categorie;

import com.opensymphony.xwork2.ActionSupport;

public class AddCategorieAction extends ActionSupport {

	private static final long serialVersionUID = -7158840857652991877L;
	private String name = null;
	private String description = null;
	private List<Categorie> categories;
	
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

	public String execute() {
		CategorieManager cm = new CategorieManager();
		
		if (!this.getName().isEmpty() && !this.getDescription().isEmpty()) {
			Categorie categorie = new Categorie(this.name, this.description);
			cm.saveCategorie(categorie);
			
			setName("");
			setDescription("");
			
			categories = cm.getAllCategoires();
			
			return SUCCESS;
		}
		
		categories = cm.getAllCategoires();
		
		addActionError("Bitte geben Sie nur korrekte Daten ein!");
		return INPUT;

	}
}