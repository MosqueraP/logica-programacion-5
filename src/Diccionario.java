import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("libro", "book");
        diccionario.put("computadora", "computer");
        diccionario.put("telefono", "phone");
        diccionario.put("agua", "water");
        diccionario.put("azul", "blue");
        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("amigo", "friend");
        diccionario.put("familia", "family");
        diccionario.put("trabajo", "work");
        diccionario.put("escuela", "school");
        diccionario.put("jugar", "play");
        diccionario.put("comer", "eat");

        // Generar 5 palabras al azar del diccionario
        String[] palabrasEspañol = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasSeleccionadas = new String[5];
        for (int i = 0; i < 5; i++) {
            palabrasSeleccionadas[i] = palabrasEspañol[random.nextInt(palabrasEspañol.length)];
        }

        // Pedir al usuario las traducciones
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        System.out.println("Bienvenido al mini juego de traducción español-inglés.");
        System.out.println("Por favor, ingrese la traducción al inglés de las siguientes palabras:");

        for (String palabra : palabrasSeleccionadas) {
            System.out.print(palabra + ": ");
            String respuestaUsuario = scanner.nextLine().trim().toLowerCase();

            if (respuestaUsuario.equals(diccionario.get(palabra))) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.get(palabra));
                respuestasIncorrectas++;
            }
        }

        // Mostrar resultados
        System.out.println("\nResumen:");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

        scanner.close();
    }
}
