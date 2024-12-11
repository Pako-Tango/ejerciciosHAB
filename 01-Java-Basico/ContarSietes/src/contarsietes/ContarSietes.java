
package contarsietes;

import java.util.Scanner;


public class ContarSietes {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[15];
        int contSietes = 0;
        
        System.out.println("Ingrese 15 numeros:");
        
        for(int i=0; i < num.length; i++);{
            int i = 0;
          System.out.println("Número " + (i+1)+ ":");
          num[i] = scanner.nextInt();
          
        if(num[i] == 7);
         contSietes++;
        }
        System.out.println("El numero 7 se ingreso " + contSietes + " veces.");  
    }
   
  
 }  
    
    

