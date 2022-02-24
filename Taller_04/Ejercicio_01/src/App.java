import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        /**
         * Iterador de menú
         */
        int flag=0;
        /**
         * Arreglo Naves Normales
         */
        ArrayList<SistemaPlanetario> sistema=new ArrayList<SistemaPlanetario>();
        Luna nuevoL;
        Planeta nuevoP;
        /**
         * Arreglo Naves Genericas
         */
        double masa;
        double densidad;
        double diametro;
        double distanciaSol;
        int ID=0;
        String nombre;
        
        while (flag!=3) {
            try {
                System.out.println("CREACION DE CUERPOS ESPACIALES EN SISTEMA PLANETARIO");
                System.out.println("1. Planetas");
                System.out.println("2. Lunas");
                System.out.println("3. Salir");
                System.out.println("Ingrese el tipo de cuerpo que desea crear: ");
                flag = Integer.parseInt(reader.readLine());
            switch (flag) {
                case 1:
                    System.out.println("--PLANETAS--");
                    System.out.println("Ingrese los siguientes datos\n");
                    System.out.print("Nombre: ");
                    nombre=reader.readLine();
                    System.out.print("Masa: ");
                    masa= Double.parseDouble(reader.readLine());
                    System.out.print("Densidad: ");
                    densidad= Double.parseDouble(reader.readLine());
                    System.out.print("Diametro: ");
                    diametro= Double.parseDouble(reader.readLine());
                    System.out.print("Distancia del sol: ");
                    distanciaSol= Double.parseDouble(reader.readLine());
                    nuevoP= new Planeta(masa,densidad,diametro,distanciaSol,ID,nombre);
                    sistema.add(nuevoP);
                    ID++;
                    System.out.println("------------------------\nPlaneta creado exitosamente!\n------------------------");
                    break;
                case 2:
                    System.out.println("--LUNAS--");
                    System.out.println("Ingrese los siguientes datos\n");
                    System.out.print("Nombre: ");
                    nombre=reader.readLine();
                    System.out.print("Masa: ");
                    masa= Double.parseDouble(reader.readLine());
                    System.out.print("Densidad: ");
                    densidad= Double.parseDouble(reader.readLine());
                    System.out.print("Diametro: ");
                    diametro= Double.parseDouble(reader.readLine());
                    System.out.print("Distancia del sol: ");
                    distanciaSol= Double.parseDouble(reader.readLine());
                    nuevoL= new Luna(masa,densidad,diametro,distanciaSol,ID,nombre);
                    sistema.add(nuevoL);
                    ID++;
                    System.out.println("------------------------\nLuna creada exitosamente!\n------------------------");
                break;
                case 3:
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
