import java.util.ArrayList;
import java.util.Date;

public class NoTripuladas  extends ASpaceShips{

    public NoTripuladas(int speed,ArrayList<String> fuelType,boolean takingOff,Date launchDate,String model,double thrust,double height,double weight){
        super(speed,fuelType,takingOff,launchDate,model,thrust,height,weight);
    }

    @Override
    public int increaseSpeed() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public void setFuelType(ArrayList<String> fuelType) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean startEngine() {
        // TODO Auto-generated method stub
        return super.startEngine();
    }
}
