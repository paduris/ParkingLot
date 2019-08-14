package model;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<Vehicle> parkedVehicles = new ArrayList<Vehicle>();
    private List<ParkingSpot> spaces = new ArrayList<ParkingSpot>();
    private List<ParkingEntry> parkingEntries = new ArrayList<>();
    private List<ParkingExit> parkingExits = new ArrayList<>();
    private List<ParkingFloor> floorList = new ArrayList<>();
    private Integer capacity;
}
