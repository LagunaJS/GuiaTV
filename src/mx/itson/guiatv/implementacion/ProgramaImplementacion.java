/**
 * 
 */
package mx.itson.guiatv.implementacion;

import java.util.List;

import org.hibernate.HibernateException;

import mx.itson.guiatv.entidades.Programa;
import mx.itson.guiatv.interfaces.IPrograma;

/**
 * @author LagunaJS
 *
 */
public class ProgramaImplementacion implements IPrograma{


	@Override
	public List<Programa> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Programa getById(int id) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int create(Programa programa) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(Programa programa) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Programa> getByCategoria(int idCategoria) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

}
