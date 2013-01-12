package vis.controller.action;

import java.util.List;

import vis.model.bl.CategorieManager;
import vis.model.db.Categorie;

import com.opensymphony.xwork2.ActionSupport;

public class GetAllCategoriesAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1344618038935954559L;
	List<Categorie> categories = null;
	
	public String execute(){
		
		CategorieManager cm = new CategorieManager();
		categories = cm.getAllCategoires();
		return SUCCESS;
		
	}
	private void dummyCategories(){
		Categorie p1 = new Categorie("Socken","Socken");
		Categorie p2 = new Categorie("Hosen","Hosen");
		Categorie p3 = new Categorie("Schuhe","Schuhe");
		categories.add(p3);
		categories.add(p2);
		categories.add(p1);
	}

	public void setCategories(List<Categorie> categorie){
		this.categories = categorie;
	}
	public List<Categorie> getCategories(){
		return this.categories;
	}
}
