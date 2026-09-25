import java.util.Scanner;

public class interfaz {
    public static void interfaz() {
        Scanner numero = new Scanner(System.in);
        String salir;
        String nivel = "";

        while (!nivel.equals("0")) {
            System.out.println("Selecciona el nivel(1,2,3,4) 0 para salir: ");
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
                    break;
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
                    break;
                case "4":
                    numero.nextLine();
                    while (true) {
                        System.out.println("Introuduce un número (o 'salir' para terminar): ");
                        salir = numero.nextLine();

                        if (salir.equalsIgnoreCase("salir")) {
                            System.out.println("Saliendo del programa");
                            break;
                        }
                        Lanzador.factorial4(salir);
                    }
                    break;
                default:
                    nivel = "0";
                    System.out.println("Saliendo del programa");
                    break;
            }
        }
    }
}