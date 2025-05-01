import java.util.HashSet;
import java.util.Set;

public class Vehicle {
    private String license;
    private String type;
    private Owner owner;
    private static Set<String> usedPlates = new HashSet<>();

    // constructor
    public Vehicle(String license, String type, Owner owner) {
        this.type = type;
        this.owner = owner;
        // ensuring unique license plate
        if (usedPlates.contains(license)) {
           System.out.println("Error: Duplicate License Plate " + license + " is not allowed");
        } else {
            this.license = license;
            usedPlates.add(license);
        }
    }
    public Vehicle shallowCopy(){
        return new Vehicle(this.license, this.type, this.owner); // shallow copy: reference to an object
    }
    public Vehicle deepCopy(){
        return new Vehicle(this.license, this.type, new Owner(this.owner.getName())); // deep copy: independent object
    }

    public String getLicensePlate() {
        return license;
    }

    public Owner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "[License Plate: " + license + ", Type: " + type + ", Owner: " + owner + "]";
    }
}

