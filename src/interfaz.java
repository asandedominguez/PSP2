import java.util.Scanner;

public class interfaz {
    public static void interfaz() {
        Scanner numero = new Scanner(System.in);
        String salir;

        while (true) {
            System.out.println("Introuduce un número (o 'salir' para terminar): ");
            salir = numero.nextLine();

            if (salir.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del programa");
                break;
            }
            int entrada = Lanzador.factorial(salir);
            System.out.println("Operación completada. Código de salida: " + entrada);
        }
        numero.close();
    }
}