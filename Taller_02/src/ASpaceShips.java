import java.util.ArrayList;
import java.util.Date;

public abstract class ASpaceShips {
    /**
     * Representa la velocidad máxima alcanzada por la nave espacial en km/h.
     */
    public int speed;
    /**
     * Representa el o los agentes combustibles empleados para propulsar la nave espacial.
     */
    public ArrayList<String> fuelType;
    /**
     * Representa el estado de despegue de la nave espacial.
     */
    public boolean takingOff = false;
    /**
     * Representa la última fecha de lanzamiento de la nave espacial.
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
    
    protected ASpaceShips(int speed,ArrayList<String> fuelType,boolean takingOff,Date launchDate,String model,double thrust,double height,double weight){
        this.speed = speed;
        this.fuelType = fuelType;
        this.takingOff= takingOff;
        this.launchDate=launchDate;
        this.model = model;
        this.thrust=thrust;
        this.height = height;
        this.weight = weight;
    }
    
    /**
     * Método para incrementar la velocidad de la nave espacial.
     */
    public abstract int  increaseSpeed();
    
    /**
     * Método para despegar la nave espacial.
     * @return Estado del despegue true = activo, false = inactivo.
     */

    public boolean startEngine() {
      this.takingOff = true;
      return takingOff;
    };
    
    /**
     * Método para asignar la lista de combustibles y agentes oxidantes para la propulsión.
     * @param fuelType Lista de los elementos combustibles para la propulsión.
     */
    public abstract void  setFuelType(ArrayList<String> fuelType);
}
