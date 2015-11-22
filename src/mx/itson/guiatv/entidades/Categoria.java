/**
 * 
 */
package mx.itson.guiatv.entidades;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * @author LagunaJS
 *
 */
@Entity
public class Categoria {
	
	private int id;
	private String nombre;
	private String descripcion;
	/**
	 * Obtiene el valor de id
	 * @return retorna id de tipo int
	 */
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	/**
	 * Asigna un valor dado a id
	 * @param recibe id y se lo asigna a id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Obtiene el valor de nombre
	 * @return retorna nombre de tipo String
	 */
	@Basic
	public String getNombre() {
		return nombre;
	}
	/**
	 * Asigna un valor dado a nombre
	 * @param recibe nombre y se lo asigna a nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Obtiene el valor de descripcion
	 * @return retorna descripcion de tipo String
	 */
	@Basic
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * Asigna un valor dado a descripcion
	 * @param recibe descripcion y se lo asigna a descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
