/**
 * 
 */
package mx.itson.guiatv.implementacion;

import java.util.List;

import org.hibernate.HibernateException;

import mx.itson.guiatv.entidades.Categoria;
import mx.itson.guiatv.interfaces.ICategoria;

/**
 * @author LagunaJS
 *
 */
public class CategoriaImplementacion implements ICategoria {


	@Override
	public List<Categoria> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Categoria getById(int id) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int create(Categoria categoria) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

}
