import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


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
        ArrayList<ASpaceShips> aNaves=new ArrayList<ASpaceShips>();
        Lanzadera nuevoL;
        NoTripuladas nuevoNT;
        Tripuladas nuevoT;
        /**
         * Arreglo Naves Genericas
         */
        ArrayList<Genericas> aGenericos=new ArrayList<Genericas>();
        Genericas nuevoG;
        String color;
        Date launchDate;
        String fuelType;
        String model;
        int speed;
        double thrust;
        double height;
        double weight;
        
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
                    System.out.println("--LANZADERAS--");
                    System.out.println("Ingrese los siguientes datos\n");
                    System.out.print("Modelo: ");
                    model=reader.readLine();
                    System.out.print("Velocidad: ");
                    speed = Integer.parseInt(reader.readLine());
                    System.out.print("Tipo de Combustible: ");
                    fuelType=reader.readLine();
                    System.out.print("Fecha de lanzamiento: ");
                    launchDate=new SimpleDateFormat("yy/mm/dd").parse(reader.readLine());
                    System.out.print("Empuje: ");
                    thrust= Double.parseDouble(reader.readLine());
                    System.out.print("Alto: ");
                    height= Double.parseDouble(reader.readLine());
                    System.out.print("Peso: ");
                    weight= Double.parseDouble(reader.readLine());
                    nuevoL= new Lanzadera(speed,fuelType,launchDate,model,thrust,height,weight);
                    aNaves.add(nuevoL);
                    System.out.println("------------------------\nNave creada exitosamente!\n------------------------");
                    break;
                case 2:
                    System.out.println("--NAVES NO TRIPULADAS--\n");
                    System.out.println("Ingrese los siguientes datos\n");
                    System.out.print("Modelo: ");
                    model=reader.readLine();
                    System.out.print("Velocidad: ");
                    speed = Integer.parseInt(reader.readLine());
                    System.out.print("Tipo de Combustible: ");
                    fuelType=reader.readLine();
                    System.out.print("Fecha de lanzamiento: ");
                    launchDate=new SimpleDateFormat("yy/mm/dd").parse(reader.readLine());
                    System.out.print("Empuje: ");
                    thrust= Double.parseDouble(reader.readLine());
                    System.out.print("Alto: ");
                    height= Double.parseDouble(reader.readLine());
                    System.out.print("Peso: ");
                    weight= Double.parseDouble(reader.readLine());
                    nuevoNT= new NoTripuladas(speed,fuelType,launchDate,model,thrust,height,weight);
                    aNaves.add(nuevoNT);
                    System.out.println("------------------------\nNave creada exitosamente!\n------------------------");
                    break;
                case 3:
                    System.out.println("--NAVES TRIPULADAS--\n");
                    System.out.println("Ingrese los siguientes datos\n");
                    System.out.print("Modelo: ");
                    model=reader.readLine();
                    System.out.print("Velocidad: ");
                    speed = Integer.parseInt(reader.readLine());
                    System.out.print("Tipo de Combustible: ");
                    fuelType=reader.readLine();
                    System.out.print("Fecha de lanzamiento: ");
                    launchDate=new SimpleDateFormat("yy/mm/dd").parse(reader.readLine());
                    System.out.print("Empuje: ");
                    thrust= Double.parseDouble(reader.readLine());
                    System.out.print("Alto: ");
                    height= Double.parseDouble(reader.readLine());
                    System.out.print("Peso: ");
                    weight= Double.parseDouble(reader.readLine());
                    nuevoT= new Tripuladas(speed,fuelType,launchDate,model,thrust,height,weight);
                    aNaves.add(nuevoT);
                    System.out.println("------------------------\nNave creada exitosamente!\n------------------------");
                    break;
                case 4:
                    System.out.println("--NAVES GENERICAS--\n");
                    System.out.println("Ingrese los siguientes datos\n");
                    System.out.print("Modelo: ");
                    model=reader.readLine();
                    System.out.print("Tipo de Combustible: ");
                    fuelType=reader.readLine();
                    System.out.print("Fecha de lanzamiento: ");
                    launchDate=new SimpleDateFormat("yy/mm/dd").parse(reader.readLine());
                    System.out.print("Color: ");
                    color= reader.readLine();
                    nuevoG= new Genericas(color,launchDate,fuelType,model);
                    aGenericos.add(nuevoG);
                    System.out.println("------------------------\nNave creada exitosamente!\n------------------------");
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
