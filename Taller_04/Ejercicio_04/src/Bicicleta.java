import java.util.Date;

public class Bicicleta extends Vehiculo{
    boolean ruedillas;

    public Bicicleta(int nroPasajeros, boolean ruedillas, boolean tripulacion, Date fechaMatricula){
        super(nroPasajeros,2,tripulacion,fechaMatricula,"Terrestre");
        this.ruedillas=ruedillas;
    }
    
    @Override
    public void detallesVehiculo() {
        nombreVehiculo();
        System.out.println("Número de pasajeros máximo: "+this.nroPasajeros);
        System.out.println("Tiene ruedillas¿?: "+this.ruedillas);
        System.out.println("Número de ruedas: "+this.nroRuedas);
        System.out.println("Hay tripulantes¿?: "+this.tripulacion);
        System.out.println("Fecha de matricula: "+this.fechaMatricula);
        System.out.println("Medio de transporte: "+this.medio);
    }
    @Override
    public void nombreVehiculo() {
        System.out.println("Tipo: Bicicleta");
    }
}
