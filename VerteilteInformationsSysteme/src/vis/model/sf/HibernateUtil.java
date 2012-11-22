package vis.model.sf;

import org.hibernate.cfg.*;
import org.hibernate.SessionFactory;

public class HibernateUtil {

		private static final SessionFactory sessionFactory;

		static {
			try {
	            // Create the SessionFactory from hibernate.cfg.xml
				sessionFactory = new Configuration().configure().buildSessionFactory();
				System.out.println("Initial SessionFactory creation");
			} catch (Throwable ex) {
				System.out.println("Initial SessionFactory creation failed." + ex);
				throw new ExceptionInInitializerError(ex);
			}
		}

		public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }

}
