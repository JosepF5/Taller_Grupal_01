import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    /**
     * Metodo main que realiza la suma de dos valores que posee como parametro
     * @param valor primer valor a sumar
     * @param valor2 segundo valor a sumar
     */
    public static void main(int valor, int valor2) {
        /**
         * Operación aritmética.
         * @suma: Variable que almacena el resultado de la operación de números enteros.
         */
        int suma = valor + valor2;
        /**
         * Impresión en pantalla del resultado de la operación.
         */
        System.out.println("La suma de " + valor + " y " + valor2 + " es: " + suma);
    }

    /**
     * Método main con dos valores de entrada que realiza la impresión
     * de un String que representa el nombre de un integrante.
     *
     * @param string Nombre del integrante.
     */
    public static void main(String string) {
        /**
         * Impresión en pantalla del String ingresado al método.
         */
        System.out.println("El nombre del integrante del grupo es: " + string);
    }

    /**
     * Método principal que establece la entrada a la ejecución del código, y
     * hace el llamado de dos métodos adicionales main.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        int valor1=Integer.parseInt(reader.readLine());
        int valor2=Integer.parseInt(reader.readLine());
        /**
         * Llamado del método main para la realización de una suma aritmética de
         * enteros y la impresión del resultado.
         */
        main(valor1, valor2);
        /**
         * LLamado del método main para la impresión de un String.
         */
        main("Josep Palomino");
    }
}
