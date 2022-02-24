import java.util.Date;

public class Genericas implements ISpaceShips{
    /**
     * Representa el color de la nave espacial.
     */
    public String color;
    /**
     * Representa la fecha de lanzamiento de la nave espacial.
     */
    public Date launchDate;
    /**
     * Representa el tipo de combustible de la nave espacial. 
     */
    public String fuelType;
    /**
     * Representa el modelo de la nave espacial.
     */
    public String model;
    
    /**
     * Constructor que permite crear un objeto Nave espacial genérica.
     * @param color Color de la nave espacial.
     * @param launchDate Fecha de lanzamiento.
     * @param fuelType Combustible. 
     * @param model Modelo.
     */

    public Genericas(String color, Date launchDate, String fuelType, String model) {
        this.color = color;
        this.launchDate = launchDate;
        this.fuelType = fuelType;
        this.model = model;
    }

    @Override
    public void capacidadCarga(String fuelType, double weight) {
        double capacidad,variableCarga;
        switch (fuelType) {
            case "TDMH":
                variableCarga=5.12;
                capacidad=(variableCarga*weight)/3.1314;
                System.out.println("La capacidad de carga de la nave es: "+capacidad);
                break;
            case "Petroleo":
                variableCarga=3.85;
                capacidad=(variableCarga*weight)/3.1314;
                System.out.println("La capacidad de carga de la nave es: "+capacidad);
                break;
            default:
                System.out.println("Desconocido. Pruebe con otra alternativa.");
                break;
        }
    }
    @Override
    public void capacidadPotencia(String fuelType) {
        double capacidad,variablePotencia;
        switch (fuelType) {
            case "TDMH":
                variablePotencia=21.15;
                capacidad=(variablePotencia)/(3.1314*9.81);
                System.out.println("La capacidad de potencia de la nave es: "+capacidad);
                break;
            case "Petroleo":
                variablePotencia=15.50;
                capacidad=(variablePotencia)/(3.1314*9.81);
                System.out.println("La capacidad de potencia de la nave es: "+capacidad);
                break;
            default:
                System.out.println("Desconocido. Pruebe con otra alternativa.");
                break;
        }
    }
    @Override
    public void capacidadVelocidad(double weight, double height) {
        double capacidad,variableVelocidad;
        switch (fuelType) {
            case "TDMH":
                variableVelocidad=123.242;
                capacidad=(variableVelocidad)/(3.1314*height);
                System.out.println("La capacidad de velocidad de la nave es: "+capacidad);
                break;
            case "Petroleo":
                variableVelocidad=785.453;
                capacidad=(variableVelocidad)/(3.1314*height);
                System.out.println("La capacidad de velocidad de la nave es: "+capacidad);
                break;
            default:
                System.out.println("Desconocido. Pruebe con otra alternativa.");
                break;
        }
    }
    @Override
    public void costoFabricacion(String fuelType, double weight,double height) {
        double capacidad,variableFabricacion;
        switch (fuelType) {
            case "TDMH":
                variableFabricacion=211.122;
                capacidad=(variableFabricacion)/(weight*height);
                System.out.println("La capacidad de fabricacion de la nave es: "+capacidad);
                break;
            case "Petroleo":
                variableFabricacion=967.453;
                capacidad=(variableFabricacion)/(weight*height);
                System.out.println("La capacidad de fabricacion de la nave es: "+capacidad);
                break;
            default:
                System.out.println("Desconocido. Pruebe con otra alternativa.");
                break;
        }
    }

}
