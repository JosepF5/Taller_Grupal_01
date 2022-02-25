import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        
        int nroPasajeros;
        int nroRuedas;
        boolean tripulacion;
        Date fechaMatricula;
        String medio;

        ArrayList<Vehiculo> nuevo= new ArrayList<Vehiculo>();
        for (int i = 0; i < 1; i++) {
            System.out.print("Número de pasajeros máximo: ");
            nroPasajeros=Integer.parseInt(reader.readLine());
            System.out.print("Número de ruedas: ");
            nroRuedas=Integer.parseInt(reader.readLine());
            System.out.print("Hay tripulacion¿?: ");
            tripulacion=Boolean.parseBoolean(reader.readLine());
            System.out.print("Fecha de matricula: ");
            fechaMatricula=new SimpleDateFormat("dd/MM/yyyy").parse(reader.readLine());
            System.out.print("Medio de transporte: ");
            medio=reader.readLine();
            Vehiculo n= new Vehiculo(nroPasajeros,nroRuedas,tripulacion,fechaMatricula,medio);
            nuevo.add(n);
            System.out.println("Vehiculo creado con éxito\n");
        }
        System.out.println("--DATOS DE LOS VEHICULOS--\n");
        for (Vehiculo vehiculo : nuevo) {
            vehiculo.detallesVehiculo();
        }
    }
}
