import java.util.ArrayList;
import java.util.Date;

public class Genericas implements ISpaceShips{

    public String color;
    /**
     * Representa la fecha de lanzamiento de la nave espacial.
     */
    public Date launchDate;
    /**
     * Representa la lista de los tipos de combustible de la nave espacial. 
     */
    public ArrayList<String> fuelType;
    /**
     * Representa el modelo de la nave espacial.
     */
    public String model;
    /**
     * Representa el estado del despegue de la nave espacial.
     */
    public boolean takeoff = false;
    /**
     * Representa el estado del aterrizaje de la nave espacial.
     */
    public boolean landing = false;
    /**
     * Representa es estado en movimiento o suspendido de la nave espacial.
     */
    public boolean statusspaceships;
    
    /**
     * Constructor que permite crear un objeto Nave espacial genérica.
     * @param color Color de la nave espacial.
     * @param launchDate Fecha de lanzamiento.
     * @param fuelType Combustible. 
     * @param model Modelo.
     * @param statusspaceships Estado de la nave espacial. 
     */

    public Genericas(String color, Date launchDate, ArrayList<String> fuelType, String model, boolean statusspaceships) {
        this.color = color;
        this.launchDate = launchDate;
        this.fuelType = fuelType;
        this.model = model;
        this.statusspaceships = statusspaceships;
    }

    @Override
    public double capacidadCarga() {
        return 0;
    }
    @Override
    public double capacidadPotencia() {
        return 0;
    }
    @Override
    public double capacidadVelocidad() {
        return 0;
    }
    @Override
    public double costoFabricacion() {
        return 0;
    }

}
