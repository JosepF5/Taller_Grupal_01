import java.util.Date;

public abstract class Vehiculo {
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

    public abstract void detallesVehiculo();
    public abstract void nombreVehiculo();
}
