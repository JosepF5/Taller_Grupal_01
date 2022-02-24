
import java.util.Date;

public abstract class ASpaceShips {
    /**
     * Representa la velocidad máxima alcanzada por la nave espacial en km/h.
     */
    public int speed;
    /**
     * Representa el combustible empleado para propulsar la nave espacial.
     */
    public String fuelType;
    /**
     * Representa la fecha de lanzamiento de la nave espacial.
     */
    public Date launchDate;
    /**
     * Representa el modelo de la nave espacial
     */
    public String model;
    /**
     * Representa el empuje de la nave espacial en toneladas.
     */
    public double thrust;   
 
    /**
    * Altura de la nave espacial en metros.
    */
    public double height;
    
    /**
     * Peso de la nave espacial en toneladas.
     */
    public double weight;
    
    protected ASpaceShips(int speed,String fuelType,Date launchDate,String model,double thrust,double height,double weight){
        this.speed = speed;
        this.fuelType = fuelType;
        this.launchDate=launchDate;
        this.model = model;
        this.thrust=thrust;
        this.height = height;
        this.weight = weight;
    }
    
    /**
     * Método para incrementar la velocidad de la nave espacial.
     */
    public abstract double  costoFabricacion(String fuelType, double weight,double height);
    
    
    /**
     * Método para asignar la lista de combustibles y agentes oxidantes para la propulsión.
     * @param fuelType Lista de los elementos combustibles para la propulsión.
     */
    public abstract void  capacidadCarga(String fuelType, double weight);
}
