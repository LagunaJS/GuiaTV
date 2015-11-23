/**
 * 
 */
package mx.itson.guiatv.interfaces;

import java.util.List;

import mx.itson.guiatv.entidades.Canal;
import mx.itson.guiatv.entidades.Categoria;
import mx.itson.guiatv.implementacion.CanalImplementacion;
import mx.itson.guiatv.implementacion.CategoriaImplementacion;

/**
 * @author LagunaJS
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ICanal canal = new CanalImplementacion();
		List<Canal> canales = canal.getByCategoria(2);
		System.out.println("yeah");
		
		/* ----------------------------------------------------- */
		Categoria categoria = new Categoria();
		categoria.setNombre("Test");
		categoria.setDescripcion("Categoria para prueba");
		
		ICategoria c = new CategoriaImplementacion();
		List<Categoria> categorias = c.getAll();
		Categoria categoria2 = c.getById(1);
		c.create(categoria);
		categoria.setDescripcion("Categoria para prueba editada");
		c.update(categoria);
		c.delete(categoria);
		/* ----------------------------------------------------- */


	}

}
