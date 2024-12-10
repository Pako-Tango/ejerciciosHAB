
package operacionesdelectura4;
   import java.util.Scanner;

public class OperacionesdeLectura4 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Por favor, introduce el primer número entero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Por favor, introduce el segundo número entero: ");
        int numero2 = scanner.nextInt();
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        
        System.out.println("\nResultados de las operaciones:");
        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + suma);
        System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + resta);
        System.out.println("Multiplicación: " + numero1 + " * " + numero2 + " = " + multiplicacion);
        System.out.println("División: " + numero1 + " / " + numero2 + " = " + division);
        
    }
    
}
