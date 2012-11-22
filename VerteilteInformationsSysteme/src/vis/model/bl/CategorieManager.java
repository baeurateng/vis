package vis.model.bl;

import java.util.List;

import org.hibernate.Session;

import vis.model.db.Categorie;
import vis.model.sf.HibernateUtil;

public class CategorieManager {

	public void saveCategorie(Categorie categorie) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		session.save(categorie);
		session.getTransaction().commit();
	}
	
	public void deleteCategorieByPrimaryKey(String primaryKey) {
		
	}
	
	public List<Categorie> getAllCategoires(){
		return null;
	}

}