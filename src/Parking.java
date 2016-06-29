import java.awt.dnd.InvalidDnDOperationException;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Created by Ronan on 23/04.
 */
public class Parking {
    private TreeMap<Integer, Car> parking;

    public Parking() {
        parking = new TreeMap<>();
    }

    public void park(int slot,Car car) {
        if (parking.containsKey(slot)) {
            throw new IllegalStateException();
        }else
            parking.put(slot, car);
    }
    public Car unpark(int slot) throws InvalidOperationException {
        if (!parking.containsKey(slot)){
            throw new InvalidOperationException();
        }else {
            Car removedCar=parking.get(slot);
            parking.put(slot,null);
            return removedCar;
        }
    }
    public String toString(){
        String fin="parking: \n";
        for (int i=0;i<parking.size();i++){
            fin+=String.valueOf(i);
            if (parking.get(i)!=null){
                fin+=": occupied\n";
            }else
                fin+=": free\n";
        }
        return fin;
    }
}

