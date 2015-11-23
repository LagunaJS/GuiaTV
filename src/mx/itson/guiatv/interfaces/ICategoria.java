/**
 * 
 */
package mx.itson.guiatv.interfaces;
import java.util.List;

import org.hibernate.HibernateException;

import mx.itson.guiatv.entidades.Categoria;
/**
 * @author LagunaJS
 *
 */
public interface ICategoria {
	
	/**
	 * Obtiene una lista de todas las categorias
	 * @return retorna un @List de tipo @Categoria
	 */
	public List<Categoria> getAll() throws HibernateException;
	
	/**
	 * Obtiene una categoria
	 * @param recibe un id de tipo int
	 * @return retorna un canal de tipo @Categoria
	 */
	public Categoria getById(int id) throws HibernateException;
	
	/**
	 * Crea una nueva categoria
	 * @param recibe un objeto de tipo @Categoria
	 * @return retorna un id de tipo @int de la categoria creada
	 */
	public int create(Categoria categoria);
	
	/**
	 * Elimina una categoria
	 * @param recibe un categoria de tipo @Categoria
	 */
	public void delete(Categoria categoria);
	
	/**
	 * Actualiza la informacion de una categoria existente
	 * @param recibe un objeto de tipo @Categoria
	 */
	public void update(Categoria categoria);
}
