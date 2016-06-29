/**
 * Created by Ronan on 23/04.
 */
public class Main4 {
    public static void main(String args[]) throws InvalidOperationException {
        Parking parking1 = new Parking();
        Car car = new Car();
        parking1.park(0,car);
        parking1.park(1,car);
        parking1.park(2,car);
        parking1.park(3,car);
        Car car2 =parking1.unpark(3);
        System.out.println(parking1);
    }
}
