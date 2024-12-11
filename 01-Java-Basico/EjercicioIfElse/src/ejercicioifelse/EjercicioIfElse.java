
package ejercicioifelse;

import java.util.Scanner;

public class EjercicioIfElse {

    public static void main(String[] args) {

        System.out.println("Ingrese la nota del alumno");
        Scanner porteclado = new Scanner(System.in);
        double calificacion = porteclado.nextDouble();

        if (calificacion < 60) {
            System.out.println("Elrendimiento del alumno es insuficiente");
        } else {
            if (calificacion >= 60 && calificacion <= 80) {
                System.out.println("El rendimiento del alumno es bueno");
            } else {
                if (calificacion >= 81 && calificacion <= 90);
                {

                    System.out.println("el rendimiento del alumno es notable");
                }
                 else {
                         System.out.println("el rendimiento del alumno es excelente");
                }
            }

        }

    }
