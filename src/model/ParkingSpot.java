package model;

import java.sql.Timestamp;

public class ParkingSpot {
    private Long parkingLotNumber;
    private String type;
    private boolean isReservedForElectricVehicle;
    private Timestamp parkedTime;
    private Vehicle vehicle;

    public boolean isAvailableForParking(Vehicle v) {
        return true;
    }
}
