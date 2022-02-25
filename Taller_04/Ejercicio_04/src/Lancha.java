import java.util.Date;

public class Lancha extends Vehiculo{
    double potenciaMotor;

    public Lancha(int nroPasajeros, double potenciaMotor, boolean tripulacion, Date fechaMatricula){
        super(nroPasajeros,4,tripulacion,fechaMatricula,"Terrestre");
        this.potenciaMotor=potenciaMotor;
    }  
    
    @Override
    public void detallesVehiculo() {
        nombreVehiculo();
        System.out.println("Número de pasajeros máximo: "+this.nroPasajeros);
        System.out.println("Potencia motor(en W): "+this.potenciaMotor);
        System.out.println("Número de ruedas: "+this.nroRuedas);
        System.out.println("Hay tripulantes¿?: "+this.tripulacion);
        System.out.println("Fecha de matricula: "+this.fechaMatricula);
        System.out.println("Medio de transporte: "+this.medio);
    }
    @Override
    public void nombreVehiculo() {
        System.out.println("Tipo: Lancha");
    }
}
