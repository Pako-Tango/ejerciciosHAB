
package ejerwhile;

import java.util.Scanner;


public class Ejerwhile {

   
    public static void main(String[] args) {
      
        /*int cont =0;
      
      while (cont<=10){
          System.out.println("estoy en el numero:" + cont);
          cont = cont +1;
      
      }*/
        
        System.out.println("ingrese su edad:");
        Scanner teclado = new Scanner(System.in);
         int edad =teclado.nextInt();
         
         while(edad>=70){
             System.out.println("ingrese su edad");
             edad=teclado.nextInt();
             
             }
         System.out.println("persona encontrada");
    }
    
}
