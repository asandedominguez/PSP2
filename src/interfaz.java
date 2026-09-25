import java.util.Scanner;

public class interfaz {
    public static void interfaz() {
        Scanner numero = new Scanner(System.in);
        String salir;
        String nivel = "";

        while (nivel != "67") {
            System.out.println("Selecciona el nivel(1,2,3,4) 67 para salir: ");
            nivel = numero.next();
            switch (nivel) {
                case "1":
                    numero.nextLine();
                    while (true) {
                        System.out.println("Introuduce un número (o 'salir' para terminar): ");
                        salir = numero.nextLine();

                        if (salir.equalsIgnoreCase("salir")) {
                            System.out.println("Saliendo del programa");
                            break;
                        }
                        Lanzador.factorial(salir);
                    }
                    break;
                case "2":
                    numero.nextLine();
                    while (true) {
                        System.out.println("Introuduce un número (o 'salir' para terminar): ");
                        salir = numero.nextLine();

                        if (salir.equalsIgnoreCase("salir")) {
                            System.out.println("Saliendo del programa");
                            break;
                        }
                        Lanzador.factorial2(salir);
                    }
                case "3":
                    numero.nextLine();
                    while (true) {
                        System.out.println("Introuduce un número (o 'salir' para terminar): ");
                        salir = numero.nextLine();

                        if (salir.equalsIgnoreCase("salir")) {
                            System.out.println("Saliendo del programa");
                            break;
                        }
                        Lanzador.factorial3(salir);
                    }
            }
        }
    }
}