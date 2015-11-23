/**
 * 
 */
package mx.itson.guiatv.implementacion;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import mx.itson.guiatv.entidades.Canal;
import mx.itson.guiatv.entidades.Horario;
import mx.itson.guiatv.interfaces.HibernateUtil;
import mx.itson.guiatv.interfaces.IHorario;

/**
 * @author LagunaJS
 *
 */
public class HorarioImplementacion implements IHorario {


	@Override
	public List<Horario> getAll() throws HibernateException {
		Session sesion = null;
		List<Horario> horarios = new ArrayList<Horario>();
		try {
			sesion = HibernateUtil.getSessionFactory().openSession();
			horarios = (List<Horario>) sesion.createQuery("from Horario").list();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return horarios;
	}


	@Override
	public Horario getById(int id) throws HibernateException {
		Horario horario = new Horario();
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Criteria criteria = sesion.createCriteria(Horario.class);
			criteria.add(Restrictions.eq("id",id));
			horario = (Horario) criteria.uniqueResult();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return horario;
	}


	@Override
	public int create(Horario horario) {
		int id = 0;
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			transaction = sesion.beginTransaction();
			sesion.save(horario);
			id = horario.getId();
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return id;
	}


	@Override
	public void delete(Horario horario) {
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			transaction = sesion.beginTransaction();
			sesion.delete(horario);
			transaction.commit();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	@Override
	public void update(Horario horario) {
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			transaction = sesion.beginTransaction();
			sesion.update(horario);
			transaction.commit();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}


	@Override
	public List<Horario> getByPrograma(int idPrograma) throws HibernateException {
		List<Horario> horarios = new ArrayList<Horario>();
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			horarios = (List<Horario>) sesion.createQuery("from Horario where idPrograma = " + idPrograma).list();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return horarios;
	}


	@Override
	public List<Horario> getByCanal(int idCanal) throws HibernateException {
		List<Horario> horarios = new ArrayList<Horario>();
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			horarios = (List<Horario>) sesion.createQuery("from Horario where idCanal = " + idCanal).list();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return horarios;
	}


	@Override
	public List<Horario> getByFecha(Date fecha) throws HibernateException {
		List<Horario> horarios = new ArrayList<Horario>();
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			horarios = (List<Horario>) sesion.createQuery("from Horario where fecha = " + fecha).list();
			sesion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return horarios;
	}

}
