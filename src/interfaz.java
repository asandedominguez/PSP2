import java.util.Scanner;

public class interfaz {
    public static void main (String [] args) {
        Scanner numero = new Scanner(System.in);

        while (true) {
            String salir = numero.nextLine();
            int num = numero.nextInt();
            if (salir == "salir") {
                System.out.println("Saliendo del programa");
                break;
            }
            else {
                System.out.println("Introuduce un número (o 'salir' para terminar): ");
            }
        }
    }
}
