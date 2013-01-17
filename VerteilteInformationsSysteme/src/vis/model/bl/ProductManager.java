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

	public void deleteProductByPrimaryKey(String name) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		Product oldProduct = (Product) session.get(Product.class, name);
		session.delete(oldProduct);

		session.getTransaction().commit();
	}

	public void deleteProduct(Product product) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		session.delete(product);
		session.getTransaction().commit();

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
		/* a Hibernate session */
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		List<Product> products = (List<Product>) session
				.createQuery("select * from product where categorie = :cat")
				.setParameter("cat", categorie).list();

		// session.getTransaction().commit();
		return products;

	}

	public List<Product> getProductsByDescription(String description) {
		/* a Hibernate session */
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		List<Product> products = (List<Product>) session
				.createQuery("from Product where description like :desc")
				.setParameter("desc", "%" + description + "%").list();

		session.getTransaction().commit();
		return products;
	}

	public List<Product> getProductsByPrice(double priceLow, double priceHigh) {
		/* a Hibernate session */
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		List<Product> products = (List<Product>) session
				.createQuery(
						"from Product where price between :priceLow and :priceHigh")
				.setParameter("priceLow", priceLow)
				.setParameter("priceHigh", priceHigh).list();

		return products;
	}

	public List<Product> getProductByPriceFrom(double priceFrom) {
		/* a Hibernate session */
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		List<Product> products = (List<Product>) session
				.createQuery("from Product where price > :priceFrom")
				.setParameter("priceFrom", priceFrom).list();

		return products;
	}
	
	
	
	public List<Product> getAllProducts() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		List<Product> products = (List<Product>) session.createQuery(
				"from Product").list();
		session.getTransaction().commit();

		return products;
	}

}