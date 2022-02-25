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
        ArrayList<Vehiculo> nuevo=new ArrayList<Vehiculo>();
        Vehiculo n;
        int nroPasajeros;
        boolean tripulacion;
        Date fechaMatricula;
        boolean ruedillas;
        String carga;
        int cantPuertas;
        double potenciaMotor;
        String marca;

        while (flag!=7) {
            try {
                System.out.println("CREACION DE VEHICULOS");
                System.out.println("1. Bicicleta");
                System.out.println("2. Camion");
                System.out.println("3. Coche");
                System.out.println("4. Lancha");
                System.out.println("5. Moto");
                System.out.println("6. Reporte de Vehiculos");
                System.out.println("7. Salir");
                System.out.println("Ingrese el tipo de cuerpo que desea crear: ");
                flag = Integer.parseInt(reader.readLine());
            switch (flag) {
                case 1:
                    System.out.println("--BICICLETA--");
                    System.out.print("Número de pasajeros máximo: ");
                    nroPasajeros=Integer.parseInt(reader.readLine());
                    System.out.print("Tiene ruedillas¿?: ");
                    ruedillas=Boolean.parseBoolean(reader.readLine());
                    System.out.print("Hay tripulacion¿?: ");
                    tripulacion=Boolean.parseBoolean(reader.readLine());
                    System.out.print("Fecha de matricula: ");
                    fechaMatricula=new SimpleDateFormat("dd/MM/yyyy").parse(reader.readLine());
                    n= new Bicicleta(nroPasajeros,ruedillas,tripulacion,fechaMatricula);
                    nuevo.add(n);
                    System.out.println("------------------------\nVehiculo creado exitosamente!\n------------------------");
                    break;
                case 2:
                    System.out.println("--CAMION--");
                    System.out.print("Número de pasajeros máximo: ");
                    nroPasajeros=Integer.parseInt(reader.readLine());
                    System.out.print("Que es lo que transporta¿?: ");
                    carga=reader.readLine();
                    System.out.print("Hay tripulacion¿?: ");
                    tripulacion=Boolean.parseBoolean(reader.readLine());
                    System.out.print("Fecha de matricula: ");
                    fechaMatricula=new SimpleDateFormat("dd/MM/yyyy").parse(reader.readLine());
                    n= new Camion(nroPasajeros,carga,tripulacion,fechaMatricula);
                    nuevo.add(n);
                    System.out.println("------------------------\nVehiculo creado exitosamente!\n------------------------");
                    break;
                case 3:
                    System.out.println("--COCHE--");
                    System.out.print("Número de pasajeros máximo: ");
                    nroPasajeros=Integer.parseInt(reader.readLine());
                    System.out.print("Número de puertas: ");
                    cantPuertas=Integer.parseInt(reader.readLine());
                    System.out.print("Hay tripulacion¿?: ");
                    tripulacion=Boolean.parseBoolean(reader.readLine());
                    System.out.print("Fecha de matricula: ");
                    fechaMatricula=new SimpleDateFormat("dd/MM/yyyy").parse(reader.readLine());
                    n= new Coche(nroPasajeros,cantPuertas,tripulacion,fechaMatricula);
                    nuevo.add(n);
                    System.out.println("------------------------\nVehiculo creado exitosamente!\n------------------------");
                    break;
                case 4:
                    System.out.println("--LANCHA--");
                    System.out.print("Número de pasajeros máximo: ");
                    nroPasajeros=Integer.parseInt(reader.readLine());
                    System.out.print("Potencia del motor(en W): ");
                    potenciaMotor=Double.parseDouble(reader.readLine());
                    System.out.print("Hay tripulacion¿?: ");
                    tripulacion=Boolean.parseBoolean(reader.readLine());
                    System.out.print("Fecha de matricula: ");
                    fechaMatricula=new SimpleDateFormat("dd/MM/yyyy").parse(reader.readLine());
                    n= new Lancha(nroPasajeros,potenciaMotor,tripulacion,fechaMatricula);
                    nuevo.add(n);
                    System.out.println("------------------------\nVehiculo creado exitosamente!\n------------------------");
                    break;
                case 5:
                    System.out.println("--MOTO--");
                    System.out.print("Número de pasajeros máximo: ");
                    nroPasajeros=Integer.parseInt(reader.readLine());
                    System.out.print("Marca: ");
                    marca=reader.readLine();
                    System.out.print("Hay tripulacion¿?: ");
                    tripulacion=Boolean.parseBoolean(reader.readLine());
                    System.out.print("Fecha de matricula: ");
                    fechaMatricula=new SimpleDateFormat("dd/MM/yyyy").parse(reader.readLine());
                    n= new Moto(nroPasajeros,marca,tripulacion,fechaMatricula);
                    nuevo.add(n);
                    System.out.println("------------------------\nVehiculo creado exitosamente!\n------------------------");
                    break;
                case 6:
                    System.out.println("--DETALLE DE LOS VEHICULOS--\n");
                    for (Vehiculo vehiculo : nuevo) {
                        System.out.println("---Vehiculo Nro "+(nuevo.indexOf(vehiculo)+1)+"---");
                        vehiculo.detallesVehiculo();
                        System.out.println("---------------------\n");
                    }
                        break;
                case 7:
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
