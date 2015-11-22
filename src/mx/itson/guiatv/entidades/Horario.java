package mx.itson.guiatv.entidades;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
/**
 * @author LagunaJS
 *
 */
@Entity
public class Horario {
	
	private int id;
	private java.sql.Time horaInicio;
	private java.sql.Time horaFin;
	private java.sql.Date fecha;
	private Programa programa;
	private Canal canal;
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
	 * Obtiene el valor de horaInicio
	 * @return retorna horaInicio de tipo java.sql.Time
	 */
	@Basic
	public java.sql.Time getHoraInicio() {
		return horaInicio;
	}
	/**
	 * Asigna un valor dado a horaInicio
	 * @param recibe horaInicio y se lo asigna a horaInicio
	 */
	public void setHoraInicio(java.sql.Time horaInicio) {
		this.horaInicio = horaInicio;
	}
	/**
	 * Obtiene el valor de horaFin
	 * @return retorna horaFin de tipo java.sql.Time
	 */
	@Basic
	public java.sql.Time getHoraFin() {
		return horaFin;
	}
	/**
	 * Asigna un valor dado a horaFin
	 * @param recibe horaFin y se lo asigna a horaFin
	 */
	public void setHoraFin(java.sql.Time horaFin) {
		this.horaFin = horaFin;
	}
	/**
	 * Obtiene el valor de fecha
	 * @return retorna fecha de tipo java.sql.Date
	 */
	@Basic
	public java.sql.Date getFecha() {
		return fecha;
	}
	/**
	 * Asigna un valor dado a fecha
	 * @param recibe fecha y se lo asigna a fecha
	 */
	public void setFecha(java.sql.Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * Obtiene el valor de programa
	 * @return retorna programa de tipo Programa
	 */
	@OneToOne
	@JoinColumn (name="idPrograma")
	public Programa getPrograma() {
		return programa;
	}
	/**
	 * Asigna un valor dado a programa
	 * @param recibe programa y se lo asigna a programa
	 */
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
	/**
	 * Obtiene el valor de canal
	 * @return retorna canal de tipo Canal
	 */
	@OneToOne
	@JoinColumn (name="idCanal")
	public Canal getCanal() {
		return canal;
	}
	/**
	 * Asigna un valor dado a canal
	 * @param recibe canal y se lo asigna a canal
	 */
	public void setCanal(Canal canal) {
		this.canal = canal;
	}
	
	

}
