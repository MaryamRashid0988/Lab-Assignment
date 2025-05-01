public class ParkingZone {
    private String ID;
    private static int IDcounter;
    private Vehicle[] vehicles = new Vehicle[5];

    public ParkingZone() {
        this.ID = "A" + ++IDcounter; // auto numerated ID
    }

    public void addVehicle(Vehicle v) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = v;
                break;
            }
        }
    }

    public String toString() {
        String result = "Zone ID: " + ID + ", Vehicles: [";

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null) {
                result += vehicles[i].toString(); // Calls Vehicle's toString() method
            } else {
                result += "Empty"; // Indicate the spot is empty
            }

            // Add a comma if this is not the last vehicle in the array
            if (i < vehicles.length - 1) {
                result += ", ";
            }
        }

        result += "]";
        return result;
    }
}
