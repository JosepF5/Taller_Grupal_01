import java.util.Date;

public class Vehiculo {
    int nroPasajeros;
    int nroRuedas;
    boolean tripulacion;
    Date fechaMatricula;
    String medio;
    
    public Vehiculo(int nroPasajeros, int nroRuedas, boolean tripulacion, Date fechaMatricula, String medio) {
        this.nroPasajeros = nroPasajeros;
        this.nroRuedas = nroRuedas;
        this.tripulacion = tripulacion;
        this.fechaMatricula = fechaMatricula;
        this.medio = medio;
    }

    public void detallesVehiculo(){
        System.out.println("Número de pasajeros máximo: "+this.nroPasajeros);
        System.out.println("Número de ruedas: "+this.nroRuedas);
        System.out.println("Hay tripulantes¿?: "+this.tripulacion);
        System.out.println("Fecha de matricula: "+this.fechaMatricula);
        System.out.println("Medio de transporte: "+this.medio);
    }
}
