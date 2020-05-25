package mylabs.mylab4.vehicle;

import mylabs.mylab4.human.MyHuman;

import java.util.ArrayList;
import java.util.List;

public class MyVehicle<T extends MyHuman> {
    private List<T> passengerList;
    private int numberOfSeats;

    public MyVehicle(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        this.passengerList = new ArrayList<>();
    }

    public T getByAge(int age) {
        for (T human : passengerList) {
            if (human.getAge() == age) {
                return human;
            }
        }
        return null;
    }

    public void carry(T passenger) {
        if (passengerList.size() < numberOfSeats) {
            passengerList.add(passenger);
        } else {
            throw new RuntimeException();
        }
    }

    public void dropOff(T passenger) {
        if (!passengerList.remove(passenger)) {
            throw new RuntimeException();
        }
    }

    public int getNumberOfOccupiedSeats() {
        return passengerList.size();
    }

    public int getTotalNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return "MyVehicle{" +
                "passengerList=" + passengerList +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
