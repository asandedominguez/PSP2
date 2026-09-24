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
                int salida = Lanzador.factorial(num);
                System.out.println("Operación completada. Código de salida: " + salida);
            }
            catch (NumberFormatException e) {
                System.out.println("Factor " + salir + " is not a valid positive integer");
                int salida = 1;
                System.out.println("Operación completada. Código de salida: " + salida);
            }
        }
        return num;
    }
}