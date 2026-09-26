import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lanzador {
    // Este método recibe en primer lugar un número introducido por el usuario en formato String. Introducimos el comando factor mediantes "ProcessBuilder", y se inicia.
    // Se hacen una serie de comprobaciones para ver sieste valor cumple las condiciones establecidas para que el comando "factor" lo descomponga, estas comprobaciones son:
    // No dejar pasar a ningún dato que no sea integer, o en caso de que lo sea no dejar pasar los que tengan un valor negativo. Por último muestra un mensaje y un código en
    // función de lo que le corresponda, y por supuesto el número y sus factores.
    public static int factorial(String numero_introducido) {
        try {
            String negativo = numero_introducido;
            if (numero_introducido.startsWith("-")) {
                numero_introducido = "";
            }

            ProcessBuilder comando = new ProcessBuilder("factor", numero_introducido);
            Process iniciar = comando.start();

            BufferedReader lectura = new BufferedReader(new InputStreamReader(iniciar.getInputStream()));
            String linea;
            while ((linea = lectura.readLine()) != null) {
                System.out.println(linea);
            }
            BufferedReader error = new BufferedReader(new InputStreamReader(iniciar.getErrorStream()));
            while ((error.readLine()) != null) {
                System.out.println("factor: " + negativo + " is not a valid positive integer");
            }
            int bien = iniciar.waitFor();
            System.out.println("Operación completada. Código de salida: " + bien);
            return bien;
        } catch (Exception e) {
            return 1;
        }

    }

    public static int factorial2(String numero_introducido) {
        try {
            String negativo = numero_introducido;
            if (numero_introducido.startsWith("-")) {
                numero_introducido = "";
            }

            ProcessBuilder comando = new ProcessBuilder("factor", numero_introducido);
            Process iniciar = comando.start();

            int decision = iniciar.waitFor();
            String formateo = (decision == 0) ? "[OK] " : "[ERROR] ";

            BufferedReader lectura = new BufferedReader(new InputStreamReader(iniciar.getInputStream()));
            String linea;
            while ((linea = lectura.readLine()) != null) {
                System.out.println(formateo + linea);
            }
            BufferedReader error = new BufferedReader(new InputStreamReader(iniciar.getErrorStream()));
            while ((error.readLine()) != null) {
                System.out.println(formateo + " factor: " + negativo + " is not a valid positive integer");
            }
            int bien = iniciar.waitFor();
            System.out.println("Operación completada. Código de salida: " + bien);
            return bien;
        } catch (Exception e) {
            return 1;
        }
    }

    public static int factorial3(String numero_introducido) {
        try {
            String negativo = numero_introducido;
            if (numero_introducido.startsWith("-")) {
                numero_introducido = "";
            }

            ProcessBuilder comando = new ProcessBuilder("factor", numero_introducido);

            File normal = new File("factor_output.log");
            File mal = new File("factor_error.log");

            comando.redirectOutput(ProcessBuilder.Redirect.appendTo(normal));
            comando.redirectError(ProcessBuilder.Redirect.appendTo(mal));

            Process iniciar = comando.start();

            int bien = iniciar.waitFor();

            System.out.println(bien);

            return bien;
        } catch (Exception e) {
            return 1;
        }
    }
    public static int factorial4(String numero_introducido) {
        try {
            String negativo = numero_introducido;
            if (numero_introducido.startsWith("-")) {
                numero_introducido = "";
            }

            ProcessBuilder comando = new ProcessBuilder("factor", numero_introducido);
            Process iniciar = comando.start();

            BufferedReader lectura = new BufferedReader(new InputStreamReader(iniciar.getInputStream()));
            String linea;
            boolean primo = true;
            boolean check = false;

            while ((linea = lectura.readLine()) != null) {
                check = true;
                System.out.println(linea);

                String[] partes = linea.split(":");
                if (partes.length > 1) {
                    String[] factores = partes[1].trim().split("\\s+");
                    primo = (factores.length == 1);
                }
            }
            BufferedReader error = new BufferedReader(new InputStreamReader(iniciar.getErrorStream()));
            while ((error.readLine()) != null) {
                System.out.println("factor: " + negativo + " is not a valid positive integer");
            }

            int bien = iniciar.waitFor();

            if (bien == 0 && check) {
                if (primo) {
                    System.out.println("¡"+numero_introducido + " es primo!");
                } else {
                    System.out.println("¡"+numero_introducido + " no es primo!");
                }
            }

            System.out.println("Operación completada. Código de salida: " + bien);
            return bien;
        } catch (Exception e) {
            return 1;
        }
    }

}

