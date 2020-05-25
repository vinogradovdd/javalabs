package mylabs.mylab4;

import mylabs.mylab4.human.MyFirefighter;
import mylabs.mylab4.human.MyHuman;
import mylabs.mylab4.human.MyPoliceman;
import mylabs.mylab4.vehicle.MyBus;
import mylabs.mylab4.vehicle.MyVehicle;
import mylabs.mylab4.vehicle.auto.MyFireEngine;
import mylabs.mylab4.vehicle.auto.MyPolice;
import mylabs.mylab4.vehicle.auto.MyTaxi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyVehicleTest {
    @SuppressWarnings({"unchecked"})
    @Test
    void testAddRemovePassengersAndRoad() {
        MyHuman human1 = new MyHuman(23);
        MyHuman human2 = new MyHuman(42);
        MyPoliceman policeman1 = new MyPoliceman(29);
        MyPoliceman policeman2 = new MyPoliceman(40);
        MyPoliceman policeman3 = new MyPoliceman(50);
        MyFirefighter firefighter = new MyFirefighter(54);

        MyBus bus = new MyBus(30);
        bus.carry(human1);
        bus.carry(human2);
        bus.carry(policeman1);
        bus.carry(firefighter);

        MyPolice police = new MyPolice(2);
        assertThrows(RuntimeException.class, () -> police.dropOff(policeman1));
        police.carry(policeman1);
        police.carry(policeman2);
        assertThrows(RuntimeException.class, () -> police.carry(policeman3));

        MyFireEngine fireEngine = new MyFireEngine(10);
        fireEngine.carry(firefighter);

        MyTaxi taxi = new MyTaxi(3);
        taxi.carry(human1);
        taxi.carry(policeman1);
        taxi.carry(firefighter);

        MyRoad road = new MyRoad();
        road.addVehicle(bus);
        road.addVehicle(police);
        road.addVehicle(fireEngine);
        road.addVehicle(taxi);
        assertEquals(10, road.getNumberOfPeople());

        MyVehicle<MyPoliceman> vehicleB = (MyVehicle<MyPoliceman>) (MyVehicle<?>) fireEngine;
        vehicleB.carry(policeman1);
        assertThrows(ClassCastException.class, () -> {
            //noinspection unused
            MyFirefighter notAFirefighter = fireEngine.getByAge(policeman1.getAge());
        });
    }
}
