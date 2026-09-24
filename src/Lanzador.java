import java.util.Scanner;

public class Lanzador {
    public static int factorial(int numero_introducido) {
        System.out.print(numero_introducido + ":");
        // INICIALIZAMOS LA VARIABLE I EN 2, YA QUE ES EL PRIMER NÚMERO CON EL QUE SE PUEDE DIVIDIR
        // MIENTRAS ESE NÚMERO SEÁ MENOR AL NÚMERO PASADO POR TECLADO SE IRÁ INCREMENTANDO DE 1 EN 1
        for (int i = 2; i <= numero_introducido; i++) {

            //SI AL DIVIDIR EL NÚMERO PASADO POR TECLADO ENTRE EL NÚMERO QUE CORRESPONDA EN LA VARABLE I
            //DA 0, PRINTEARA EN TERMINAL EL NÚMERO QUE A DÍVIDO AL NÚMERO PASADO POR TECLADO
            while (numero_introducido % i == 0) {
                System.out.print(" " + i);
                //ACTUALIZA EL VALOR DE ESTE HASTÁ QUE SE TERMINE LA CONDICIÓN DEL BUCLE FOR
                numero_introducido /= i;
            }
        }
        System.out.println();
        return 0;
    }
    public static void main(String[] args) {
        int numero_recibido = interfaz.interfaz();
        factorial(numero_recibido);
    }
}
