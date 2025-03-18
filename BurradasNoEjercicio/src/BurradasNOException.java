/**
 * Creada excepcion especial para palabras malsonantes
 * @author Sergio
 * @version 1.0
 */
public class BurradasNOException extends Exception{
	
	/**
	 * Creamos una excepcion, con un mensaje por defecto
	 * Con super, enviamos un mensaje una vez generada la excepcion
	 */
	public BurradasNOException () {
		
		super("No se habla asi");
	}
}
