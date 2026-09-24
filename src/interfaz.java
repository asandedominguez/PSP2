import java.util.Scanner;

public class interfaz {
    public static void main (String [] args) {
        Scanner numero = new Scanner(System.in);
        int num;
        String salir;

        while (true) {
            System.out.println("Introuduce un número (o 'salir' para terminar): ");
            salir = numero.nextLine();
            if (salir.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del programa");
                break;
            }
            else {
                num = Integer.parseInt(salir);
                System.out.println(num);
            }
        }
    }
}
