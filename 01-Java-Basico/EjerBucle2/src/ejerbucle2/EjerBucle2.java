
package ejerbucle2;
import java.util.Scanner;


public class EjerBucle2 {
    public static void main(String[] args) {
        (Scanner scanner = new Scanner(System.in));
        {
            System.out.print("Ingrese un número entero positivo: ");
            int num = scanner.nextInt();
            
            if (num > 0) {
                System.out.println("Tabla de multiplicar del " + num + ":");
                for (int cont = 1; cont <= 10; cont++) {
                    System.out.println(num + " x " + cont + " = " + (num * cont));
                }
            } else {
                System.out.println("Por favor, ingrese un número entero positivo.");
            }
        }
    }
}
