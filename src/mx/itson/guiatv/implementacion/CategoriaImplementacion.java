/**
 * 
 */
package mx.itson.guiatv.implementacion;

import java.util.ArrayList;
import java.util.List;

import javax.swing.SortingFocusTraversalPolicy;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import mx.itson.guiatv.entidades.Categoria;
import mx.itson.guiatv.interfaces.HibernateUtil;
import mx.itson.guiatv.interfaces.ICategoria;

/**
 * @author LagunaJS
 *
 */
public class CategoriaImplementacion implements ICategoria {


	@Override
	public List<Categoria> getAll() throws HibernateException {
		Session sesion = null;
		List<Categoria> categorias = new ArrayList<Categoria>();
		try {
			sesion = HibernateUtil.getSessionFactory().openSession();
			categorias = (List<Categoria>) sesion.createQuery("from Categoria").list();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return categorias;
	}


	@Override
	public Categoria getById(int id) throws HibernateException {
		Categoria categoria = new Categoria();
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Criteria criteria = sesion.createCriteria(Categoria.class);
			criteria.add(Restrictions.eq("id",id));
			categoria = (Categoria) criteria.uniqueResult();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return categoria;
	}


	@Override
	public int create(Categoria categoria) {
		int id = 0;
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			transaction = sesion.beginTransaction();
			sesion.save(categoria);
			id = categoria.getId();
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return id;
	}


	@Override
	public void delete(Categoria categoria) {
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			transaction = sesion.beginTransaction();
			sesion.delete(categoria);
			transaction.commit();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}


	@Override
	public void update(Categoria categoria) {
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			transaction = sesion.beginTransaction();
			sesion.update(categoria);
			transaction.commit();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
