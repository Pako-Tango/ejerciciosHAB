
package ejercicioswitch;

import java.util.Scanner;


public class EjercicioSwitch {

    
    public static void main(String[] args) {
        System.out.println("ingrese un numero del 1 al 7 para saber que dia de lsa semana es");
        Scanner porteclado = new Scanner(System.in); 
        int dia = porteclado.nextInt(); 
        

switch(dia){
    case 1: System.out.println("El dia de la semana es lunes");
        break;
    case 2: System.out.println("El dia de la semana es martes");
        break;
    case 3:System.out.println("El dia de la semana es miercoles");
        break;
    case 4:System.out.println("El dia de la semana es jueves"); 
        break;
    default:
       
}

System.out.println("El costo de envío a destino " + + " es: $" );

    }
    
}
