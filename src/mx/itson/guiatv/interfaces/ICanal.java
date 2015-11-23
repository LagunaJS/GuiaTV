/**
 * 
 */
package mx.itson.guiatv.interfaces;

import java.util.List;

import org.hibernate.HibernateException;

import mx.itson.guiatv.entidades.Canal;

/**
 * @author LagunaJS
 *
 */
public interface ICanal {
	
	/**
	 * Obtiene una lista de todos los canales
	 * @return retorna un @List de tipo @Canal
	 */
	public List<Canal> getAll() throws HibernateException;
	
	/**
	 * Obtiene un canal
	 * @param recibe un id de tipo int
	 * @return retorna un canal de tipo @Canal
	 */
	public Canal getById(int id) throws HibernateException;
	
	/**
	 * Crea un nuevo canal
	 * @param recibe un objeto de tipo @Canal
	 * @return retorna un id de tipo @int del canal creado
	 */
	public int create(Canal canal);
	
	/**
	 * Elimina un canal
	 * @param recibe un id de tipo @int
	 */
	public void delete(Canal canal);
	
	/**
	 * Actualiza la informacion de un canal existente
	 * @param recibe un objeto de tipo @Canal
	 */
	public void update(Canal canal);
	
	/**
	 * Obtiene una lista de canales filtrados por categoria
	 * @param recibe el id de una categoria de tipo @int
	 * @return retorna un @List de tipo @Canal
	 */
	public List<Canal> getByCategoria(int idCategoria) throws HibernateException;

}
