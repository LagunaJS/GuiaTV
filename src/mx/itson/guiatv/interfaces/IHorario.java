/**
 * 
 */
package mx.itson.guiatv.interfaces;

import java.util.List;

import org.hibernate.HibernateException;

import mx.itson.guiatv.entidades.Horario;

/**
 * @author LagunaJS
 *
 */
public interface IHorario {
	
	/**
	 * Obtiene una lista de todos los horarios
	 * @return retorna un @List de tipo @Horario
	 */
	public List<Horario> getAll() throws HibernateException;
	
	/**
	 * Obtiene un horario
	 * @param recibe un id de tipo int
	 * @return retorna un horario de tipo @Horario
	 */
	public Horario getById(int id) throws HibernateException;
	
	/**
	 * Crea un nuevo horario
	 * @param recibe un objeto de tipo @Horario
	 * @return retorna un id de tipo @int del horario creado
	 */
	public int create(Horario horario);
	
	/**
	 * Elimina un horario
	 * @param recibe un id de tipo @int
	 */
	public void delete(int id);
	
	/**
	 * Actualiza la informacion de un horario existente
	 * @param recibe un objeto de tipo @Horario
	 */
	public void update(Horario horario);
	
	/**
	 * Obtiene una lista de horarios filtrados por programa
	 * @param recibe el id de un programa de tipo @int
	 * @return retorna un @List de tipo @Horario
	 */
	public List<Horario> getByPrograma(int idPrograma) throws HibernateException;
	
	/**
	 * Obtiene una lista de horarios filtrados por canal
	 * @param recibe el id de un canal de tipo @int
	 * @return retorna un @List de tipo @Horario
	 */
	public List<Horario> getByCanal(int idCanal) throws HibernateException;
	
	/**
	 * Obtiene una lista de horarios filtrados por fecha
	 * @param recibe la fecha de tipo @java.sql.Date
	 * @return retorna un @List de tipo @Horario
	 */
	public List<Horario> getByFecha(java.sql.Date fecha) throws HibernateException;
}
