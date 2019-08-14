package model;

public class Vehicle {
    private String name;
    private String type;
    private String make;
    private String model;
    private String year;
    private String vin;
    private boolean isParked;
    private Customer owner;


    public Vehicle(String name, String type, String make, String model, String year, String vin, boolean isParked, Customer owner) {
        this.name = name;
        this.type = type;
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
        this.isParked = isParked;
        this.owner = owner;
    }
}
