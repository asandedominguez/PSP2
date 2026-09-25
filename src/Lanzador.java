import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lanzador {
    public static int factorial(String numero_introducido) {
        try {
            ProcessBuilder comando = new ProcessBuilder("factor", String.valueOf(numero_introducido));
            Process iniciar = comando.start();

            BufferedReader lectura = new BufferedReader(new InputStreamReader(iniciar.getInputStream()));
            String linea;
            while ((linea = lectura.readLine()) != null) {
                System.out.println(linea);
            }
            BufferedReader error = new BufferedReader(new InputStreamReader(iniciar.getErrorStream()));
            String lineaError;
            while ((lineaError = error.readLine()) != null) {
                System.out.println("factor: " + numero_introducido + " is not a valid positive integer");
            }
            int bien = iniciar.waitFor();
            System.out.println("Operación completada. Código de salida: " + bien);
            return bien;
        }
        catch (Exception e) {
            return 1;
        }

    }
    public static void main(String[] args) {
        interfaz.interfaz();

    }
}
