import java.util.Date;

public class Camion extends Vehiculo{
    String carga;

    public Camion(int nroPasajeros, String carga, boolean tripulacion, Date fechaMatricula){
        super(nroPasajeros,4,tripulacion,fechaMatricula,"Terrestre");
        this.carga=carga;
    } 
    
    @Override
    public void detallesVehiculo() {
        nombreVehiculo();
        System.out.println("Número de pasajeros máximo: "+this.nroPasajeros);
        System.out.println("Que transporta¿?: "+this.carga);
        System.out.println("Número de ruedas: "+this.nroRuedas);
        System.out.println("Hay tripulantes¿?: "+this.tripulacion);
        System.out.println("Fecha de matricula: "+this.fechaMatricula);
        System.out.println("Medio de transporte: "+this.medio);
    }
    @Override
    public void nombreVehiculo() {
        System.out.println("Tipo: Camion");
    }
}
