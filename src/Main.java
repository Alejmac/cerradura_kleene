import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de palabras en el lenguaje
        System.out.print("¿Cuántas palabras contiene el lenguaje? ");
        int numPalabras = scanner.nextInt();

        // Solicitar al usuario las palabras del lenguaje
        List<String> lenguaje = new ArrayList<>();
        for (int i = 0; i < numPalabras; i++) {
            System.out.print("Ingresa la palabra " + (i + 1) + ": ");
            String palabra = scanner.next();
            lenguaje.add(palabra);
        }

        // Crear la instancia de CerraduraKleene con el lenguaje ingresado
        CerraduraKleene cerraduraKleene = new CerraduraKleene(lenguaje);

        // Solicitar al usuario el nivel de cerradura deseado
        System.out.print("¿Que nivel de cerradura de Kleene deseas conocer? ");
        int nivel = scanner.nextInt();

        // Obtener y mostrar la cerradura para el nivel dado
        List<String> resultadoCerradura = cerraduraKleene.obtenerCerradura(nivel);
        System.out.println("Cerradura de nivel " + nivel + ": " + resultadoCerradura);
        System.out.println("Cantidad de palabras generadas: " + resultadoCerradura.size());

        scanner.close();
    }


}