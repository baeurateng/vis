package vis.model.bl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import vis.model.db.Categorie;
import vis.model.db.Customer;
import vis.model.sf.HibernateUtil;

public class CategorieManager {

	public void saveCategorie(Categorie categorie) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		session.save(categorie);
		session.getTransaction().commit();
	}
	
	public void deleteCategorieByPrimaryKey(String name) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		Categorie oldCategorie = (Categorie) session.get(Categorie.class, name);
		session.delete(oldCategorie);
		
		session.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<Categorie> getAllCategoires(){
		List<Categorie> categorie = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
            Query query = session.createQuery("from Categorie");
            query.setCacheable(true);
            categorie =  (List<Categorie>)query.list();
            session.getTransaction().commit();

        return categorie==null||categorie.isEmpty() ? null:categorie;
	}

}