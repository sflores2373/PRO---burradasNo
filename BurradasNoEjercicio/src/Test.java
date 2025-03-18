import java.util.Scanner;
/**
 *  Implemento clase para censurar palabras malsonantes
 *  @author Sergio
 *  @version 1.0
 */
public class Test {
	
	/**
	 * Array que almacena las palabras a censurar
	 */
    static String tpalabros[] = {"caca","culo","pedo","pis"};
    
    
    public static void main ( String argv[]){
        
        Scanner sc= new Scanner(System.in);
        String palabra = "" ;
        boolean puente = true;//Condicion de salida del bucle
        /**
         * Mensaje para el usuario, indicando las opciones posibles
         */
        System.out.println("Introduce tus mensajes, o pulsa . Para terminar:");
       
        do {
        	
        	/**
        	 * Leemos la entrada del usuario, si es '.' terminamos el bucle
        	 * Si detectamos una entrada no valida, lanzamos la excepcion 
        	 * imprimiendo el mensaje por defecto de este.
        	 */
        	try {
        		
            palabra = leerLineaOK(sc);
            
        	if (palabra.equals(".")) {
        		puente = false;
        		break;
        	} else {
        		System.out.println("OK");
        	}
        	
        	} catch (BurradasNOException err) {
        		
        		System.out.println(err.getMessage());
        	}
        	
        } while(puente);
        
    	System.out.println("Fin de programa");
    
    }
     /**
      * Iteramos con un bucle para comparar la entrada con los valores el array "tpalabros []"
      * @param sc
      * @return Devuelve la palabra introducida por el usuario
      * @throws BurradasNOException
      */
    public static String leerLineaOK (Scanner sc) throws BurradasNOException {
       
    	String palabra = sc.nextLine();
    	
    	for (int i = 0; i < tpalabros.length; i++) {
			if (palabra.toLowerCase().contains(tpalabros[i])) {
				
				throw new BurradasNOException();
			}
		}
        return palabra;
    }
}
