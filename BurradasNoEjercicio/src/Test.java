import java.util.Scanner;

public class Test {
	
    static String tpalabros[] = {"caca","culo","pedo","pis"};
    
    public static void main ( String argv[]){
        
        Scanner sc= new Scanner(System.in);
        String palabra = "" ;
        boolean puente = true;
        System.out.println("Introduce tus mensajes, o pulsa . Para terminar:");
        // Completar
        
        do {
        	
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
     
    public static String leerLineaOK (Scanner sc) throws BurradasNOException {
        //completar
    	
    	String palabra = sc.nextLine();
    	
    	for (int i = 0; i < tpalabros.length; i++) {
			if (palabra.toLowerCase().contains(tpalabros[i])) {
				
				throw new BurradasNOException();
			}
		}
        return palabra;
    }
}
