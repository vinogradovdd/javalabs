package mylabs.mylab4.vehicle.auto;

import mylabs.mylab4.human.MyHuman;
import mylabs.mylab4.vehicle.MyVehicle;

public class MyAuto<T extends MyHuman> extends MyVehicle<T> {
    public MyAuto(int numberOfSeats) {
        super(numberOfSeats);
    }
}
