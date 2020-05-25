package mylabs.mylab4;

import mylabs.mylab4.vehicle.MyVehicle;

import java.util.HashSet;
import java.util.Set;

public class MyRoad {
    private Set<MyVehicle<?>> vehicleSet = new HashSet<>();

    public int getNumberOfPeople() {
        int ret = 0;
        for (MyVehicle<?> vehicle : vehicleSet) {
            ret += vehicle.getNumberOfOccupiedSeats();
        }
        return ret;
    }

    public void addVehicle(MyVehicle<?> vehicle) {
        vehicleSet.add(vehicle);
    }
}
