import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lanzador {
    public static int factorial(int numero_introducido) {
        try {
            ProcessBuilder comando = new ProcessBuilder("factor", String.valueOf(numero_introducido));
            Process iniciar = comando.start();

            BufferedReader lectura = new BufferedReader(new InputStreamReader(iniciar.getInputStream()));
            String linea;
            while ((linea = lectura.readLine()) != null) {
                System.out.println(linea);
            }
            return iniciar.waitFor();
        }
        catch (Exception e) {
            return 1;
        }

    }
    public static void main(String[] args) {
        interfaz.interfaz();

    }
}
