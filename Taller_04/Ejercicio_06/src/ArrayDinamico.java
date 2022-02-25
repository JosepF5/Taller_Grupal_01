import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class ArrayDinamico {
    BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    public ArrayDinamico(){}

    public void DinamicArray() throws IOException {
        Vector<Integer> vector = new Vector<Integer>();
        int d = 0;
        int j = 0;
        while (true) {
                try {
                    System.out.print("Ingrese un número: ");
                    d = Integer.parseInt(reader.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Dato no valido. Por favor, intente nuevamente.");
                }
            vector.addElement(d);
            if (j>0) {
                if ((vector.elementAt(j) == vector.elementAt(j - 1))) {
                    vector.removeElementAt(j);
                    break;
                }
            }
            j++;
        }
        vector.forEach((n) -> System.out.println(n));
    }
}
