/**
 * 
 */
package mx.itson.guiatv.implementacion;

import java.util.List;

import org.hibernate.HibernateException;

import mx.itson.guiatv.entidades.Canal;
import mx.itson.guiatv.interfaces.ICanal;

/**
 * @author LagunaJS
 *
 */
public class CanalImplementacion implements ICanal {


	@Override
	public List<Canal> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Canal getById(int id) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int create(Canal canal) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(Canal canal) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Canal> getByCategoria(int idCategoria) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

}
