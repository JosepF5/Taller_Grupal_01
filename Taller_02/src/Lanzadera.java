import java.util.Date;

public class Lanzadera extends ASpaceShips{
    
    public Lanzadera(int speed,String fuelType,Date launchDate,String model,double thrust,double height,double weight){
        super(speed,fuelType,launchDate,model,thrust,height,weight);
    }

    @Override
    public void capacidadCarga(String fuelType, double weight) {
        double capacidad,variableCarga;
        switch (fuelType) {
            case "TDMH":
                variableCarga=1.201;
                capacidad=(variableCarga)*(height);
                System.out.println("La capacidad de velocidad de la nave es: "+capacidad);
                break;
            case "Petroleo":
                variableCarga=1.345;
                capacidad=(variableCarga)*(height);
                System.out.println("La capacidad de velocidad de la nave es: "+capacidad);
                break;
            case "Tetróxido de Nitrógeno":
                variableCarga=1.845;
                capacidad=(variableCarga)*(height);
                System.out.println("La capacidad de velocidad de la nave es: "+capacidad);
                break;
            default:
                System.out.println("Desconocido. Pruebe con otra alternativa.");
                break;
        }
    }
    @Override
    public double costoFabricacion(String fuelType, double weight, double height) {
        double capacidad=0,variableFabricacion;
        switch (fuelType) {
            case "TDMH":
                variableFabricacion=10.45;
                capacidad=(variableFabricacion*height*weight)/(100);
                System.out.println("La capacidad de velocidad de la nave es: "+capacidad);
                break;
            case "Petroleo":
                variableFabricacion=10.96;
                capacidad=(variableFabricacion*height*weight)/(100);
                System.out.println("La capacidad de velocidad de la nave es: "+capacidad);
                break;
            case "Tetróxido de Nitrógeno":
                variableFabricacion=10.63;
                capacidad=(variableFabricacion*height*weight)/(100);
                System.out.println("La capacidad de velocidad de la nave es: "+capacidad);
                break;
            default:
                System.out.println("Desconocido. Pruebe con otra alternativa.");
                break;
        }
        return capacidad;
    }
}
