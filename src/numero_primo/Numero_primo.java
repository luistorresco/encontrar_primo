/*
Hacer un programa que lea un numero entero positivo y 
luego imprima si es o no un numero primo
 */
package numero_primo;

import java.util.Scanner;

/**
 *
 * @author luistorresco
 */
public class Numero_primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        int num, opcion;
        boolean esPrimo;

        do {
            System.out.print("Introduzca un número entero positivo (0 para salir): ");
            num = objread.nextInt();
            if (num <= 1) {
                esPrimo = false;
            } else {
                esPrimo = true;
                int i = 2;
                while (i <= num / 2) {
                    if (num % i == 0) {
                        esPrimo = false;
                        break;
                    }
                    i++;
                }
            }

            switch (num) {
                case 0:
                    System.out.println("¡Hasta la vista!");
                    break;
                default:
                    if (esPrimo) {
                        System.out.println(num + " es un número primo.");
                    } else {
                        System.out.println(num + " no es un número primo.");
                    }
                    break;
            }

        } while (num != 0);
    }
}

