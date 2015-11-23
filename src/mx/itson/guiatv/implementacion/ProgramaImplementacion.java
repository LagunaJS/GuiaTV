/**
 * 
 */
package mx.itson.guiatv.implementacion;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import mx.itson.guiatv.entidades.Programa;
import mx.itson.guiatv.interfaces.HibernateUtil;
import mx.itson.guiatv.interfaces.IPrograma;

/**
 * @author LagunaJS
 *
 */
public class ProgramaImplementacion implements IPrograma{


	@Override
	public List<Programa> getAll() throws HibernateException {
		Session sesion = null;
		List<Programa> programas = new ArrayList<Programa>();
		try {
			sesion = HibernateUtil.getSessionFactory().openSession();
			programas = (List<Programa>) sesion.createQuery("from Programa").list();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return programas;
	}


	@Override
	public Programa getById(int id) throws HibernateException {
		Programa programa = new Programa();
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Criteria criteria = sesion.createCriteria(Programa.class);
			criteria.add(Restrictions.eq("id",id));
			programa = (Programa) criteria.uniqueResult();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return programa;
	}


	@Override
	public int create(Programa programa) {
		int id = 0;
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			transaction = sesion.beginTransaction();
			sesion.save(programa);
			id = programa.getId();
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return id;
	}


	@Override
	public void delete(Programa programa) {
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			transaction = sesion.beginTransaction();
			sesion.delete(programa);
			transaction.commit();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}


	@Override
	public void update(Programa programa) {
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			transaction = sesion.beginTransaction();
			sesion.update(programa);
			transaction.commit();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	@Override
	public List<Programa> getByCategoria(int idCategoria) throws HibernateException {
		List<Programa> programas = new ArrayList<Programa>();
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			programas = (List<Programa>) sesion.createQuery("from Programa where idCategoria = " + idCategoria).list();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return programas;
	}

}
