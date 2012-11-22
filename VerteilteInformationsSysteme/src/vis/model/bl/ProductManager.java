package vis.model.bl;

import java.util.List;

import org.hibernate.Session;

import vis.model.db.Categorie;
import vis.model.db.Product;
import vis.model.sf.HibernateUtil;

public class ProductManager {

	public void saveProduct(Product product) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
	}

	public void deleteProductByPrimaryKey(String primaryKey) {

	}

	public Product getProductByPrimaryKey(String primaryKey) {
		/* a Hibernate session */
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		Product product = (Product) session.get(Product.class, primaryKey);
		session.getTransaction().commit();
		return product;
	}

	public List<Product> getProductsByCategorie(Categorie categorie) {
		return null;
	}

	public List<Product> getProductsByDescription(String description) {
		return null;
	}

	public List<Product> getProductsByPrice(double priceLow, double priceHigh) {
		return null;
	}
	
	public List<Product> getAllProducts(){
		return null;
	}

}