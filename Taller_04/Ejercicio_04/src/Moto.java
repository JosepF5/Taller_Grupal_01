import java.util.Date;

public class Moto extends Vehiculo{
    String marca;

    public Moto(int nroPasajeros, String marca, boolean tripulacion, Date fechaMatricula){
        super(nroPasajeros,4,tripulacion,fechaMatricula,"Terrestre");
        this.marca=marca;
    } 
    
    @Override
    public void detallesVehiculo() {
        nombreVehiculo();
        System.out.println("Número de pasajeros máximo: "+this.nroPasajeros);
        System.out.println("Marca: "+this.marca);
        System.out.println("Número de ruedas: "+this.nroRuedas);
        System.out.println("Hay tripulantes¿?: "+this.tripulacion);
        System.out.println("Fecha de matricula: "+this.fechaMatricula);
        System.out.println("Medio de transporte: "+this.medio);
    }
    @Override
    public void nombreVehiculo() {
        System.out.println("Tipo: Moto");
    }
}
