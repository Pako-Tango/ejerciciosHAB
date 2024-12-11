
package ejerbucle1;
import java.util.Scanner;

public class EjerBucle1 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int sumaTotal = 0; 
       int num;  
      
       
       System.out.println("Ingrese números positivos para acumular su suma.");
        System.out.println("Para terminar, ingrese un número negativo.");
        
        
        while (true) {
            System.out.print("Ingrese un número: ");
            num = scanner.nextInt();
            
         if (num < 0) {
                  sumaTotal= num;
                System.out.println("La suma total de los números positivos ingresados es: " + sumaTotal);        
                }
        }
    }
    }
    
  