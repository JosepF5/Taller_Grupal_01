import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

        int flag=0;
        
        while (flag!=5) {
            try {
            System.out.println("CREACION DE NAVES ESPACIALES");
            System.out.println("1. Vehículos Lanzadera");
            System.out.println("2. Naves espaciales no tripuladas");
            System.out.println("3. Naves espaciales tripuladas ");
            System.out.println("4. Naves espaciales genéricas");
            System.out.println("5. Salir");
            System.out.println("Ingrese el tipo de nave espacial que desea crear: ");
            flag = Integer.parseInt(reader.readLine());
            switch (flag) {
                case 1:
                System.out.println("Caso 1");
                    break;
                case 2:
                System.out.println("Caso 2");
                    break;
                case 3:
                System.out.println("Caso 3");
                    break;
                case 4:
                System.out.println("Caso 4");
                    break;
                case 5:
                System.out.println("Muchas gracias!");
                    break;
                default:
                System.out.println("Por favor, ingrese un dato válido.");
                    break;
            }
            } catch (Exception e) {
                System.out.println("Por favor, ingrese un dato válido.");
            }
        }
        
    }
}
