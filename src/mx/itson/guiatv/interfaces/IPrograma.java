/**
 * 
 */
package mx.itson.guiatv.interfaces;

import java.util.List;

import org.hibernate.HibernateException;

import mx.itson.guiatv.entidades.Programa;

/**
 * @author LagunaJS
 *
 */
public interface IPrograma {
	
	/**
	 * Obtiene una lista de todos los programas
	 * @return retorna un @List de tipo @Programa
	 */
	public List<Programa> getAll() throws HibernateException;
	
	/**
	 * Obtiene un programa
	 * @param recibe un id de tipo int
	 * @return retorna un programa de tipo @Programa
	 */
	public Programa getById(int id) throws HibernateException;
	
	/**
	 * Crea un nuevo programa
	 * @param recibe un objeto de tipo @Programa
	 * @return retorna un id de tipo @int del programa creado
	 */
	public int create(Programa programa);
	
	/**
	 * Elimina un programa
	 * @param recibe un id de tipo @int
	 */
	public void delete(Programa programa);
	
	/**
	 * Actualiza la informacion de un programa existente
	 * @param recibe un objeto de tipo @Programa
	 */
	public void update(Programa programa);
	
	/**
	 * Obtiene una lista de programas filtrados por categoria
	 * @param recibe el id de una categoria de tipo @int
	 * @return retorna un @List de tipo @Programa
	 */
	public List<Programa> getByCategoria(int idCategoria) throws HibernateException;

}
