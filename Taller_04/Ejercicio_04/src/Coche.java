import java.util.Date;

public class Coche extends Vehiculo{
    
    int cantPuertas;

    public Coche(int nroPasajeros, int cantPuertas, boolean tripulacion, Date fechaMatricula){
        super(nroPasajeros,4,tripulacion,fechaMatricula,"Terrestre");
        this.cantPuertas=cantPuertas;
    } 
    
    @Override
    public void detallesVehiculo() {
        nombreVehiculo();
        System.out.println("Número de pasajeros máximo: "+this.nroPasajeros);
        System.out.println("Número de puertas: "+this.cantPuertas);
        System.out.println("Número de ruedas: "+this.nroRuedas);
        System.out.println("Hay tripulantes¿?: "+this.tripulacion);
        System.out.println("Fecha de matricula: "+this.fechaMatricula);
        System.out.println("Medio de transporte: "+this.medio);
    }
    @Override
    public void nombreVehiculo() {
        System.out.println("Tipo: Coche");
    }
}
