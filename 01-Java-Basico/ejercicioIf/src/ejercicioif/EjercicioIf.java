
package ejercicioif;

import java.util.Scanner;


public class EjercicioIf {


    public static void main(String[] args) {
      
      Scanner porteclado = new Scanner (System.in);
      double peso = porteclado.nextDouble();
      
      System.out.println("Ingrese su peso:");
      
      if (peso>=100){
        System.out.println("Puede subir al juego");
    
      }
      else {
        System.out.println("No puede subir al juego. Supera el peso solicitado");    
    }
      


      
              
           
        
        
        
    }
    
}
