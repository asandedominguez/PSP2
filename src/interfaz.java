import java.util.Scanner;

public class interfaz {
    public static int interfaz() {
        Scanner numero = new Scanner(System.in);
        int num = 0;
        String salir;

        while (true) {
            System.out.println("Introuduce un número (o 'salir' para terminar): ");
            salir = numero.nextLine();
            if (salir.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del programa");
                break;
            }
            try {
                num = Integer.parseInt(salir);
            }
            catch (NumberFormatException e) {
                System.out.println("Saliendo del programa");
            }
        }
        return num;
    }
}
