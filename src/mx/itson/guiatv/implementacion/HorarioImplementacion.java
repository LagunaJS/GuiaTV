/**
 * 
 */
package mx.itson.guiatv.implementacion;

import java.sql.Date;
import java.util.List;

import org.hibernate.HibernateException;

import mx.itson.guiatv.entidades.Horario;
import mx.itson.guiatv.interfaces.IHorario;

/**
 * @author LagunaJS
 *
 */
public class HorarioImplementacion implements IHorario {


	@Override
	public List<Horario> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Horario getById(int id) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int create(Horario horario) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(Horario horario) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Horario> getByPrograma(int idPrograma) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Horario> getByCanal(int idCanal) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Horario> getByFecha(Date fecha) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

}
