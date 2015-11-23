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

import mx.itson.guiatv.entidades.Canal;
import mx.itson.guiatv.interfaces.HibernateUtil;
import mx.itson.guiatv.interfaces.ICanal;

/**
 * @author LagunaJS
 *
 */
public class CanalImplementacion implements ICanal {


	@Override
	public List<Canal> getAll() throws HibernateException {
		Session sesion = null;
		List<Canal> canales = new ArrayList<Canal>();
		try {
			sesion = HibernateUtil.getSessionFactory().openSession();
			canales = (List<Canal>) sesion.createQuery("from Canal").list();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return canales;
	}


	@Override
	public Canal getById(int id) throws HibernateException {
		Canal canal = new Canal();
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Criteria criteria = sesion.createCriteria(Canal.class);
			criteria.add(Restrictions.eq("id",id));
			canal = (Canal) criteria.uniqueResult();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return canal;
	}


	@Override
	public int create(Canal canal) {
		int id = 0;
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			transaction = sesion.beginTransaction();
			sesion.save(canal);
			id = canal.getId();
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return id;
	}


	@Override
	public void delete(Canal canal) {
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			transaction = sesion.beginTransaction();
			sesion.delete(canal);
			transaction.commit();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}


	@Override
	public void update(Canal canal) {
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			transaction = sesion.beginTransaction();
			sesion.update(canal);
			transaction.commit();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}


	@Override
	public List<Canal> getByCategoria(int idCategoria) throws HibernateException {
		List<Canal> canales = new ArrayList<Canal>();
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			canales = (List<Canal>) sesion.createQuery("from Canal where idCategoria = " + idCategoria).list();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return canales;
	}

}
