public class ParkingSystem {
    private static ParkingSystem instance;
    private String campus;
    private Supervisor supervisor;
    private ParkingZone[] zones;
    private PermitHolder[] permitHolders;
    int zonecount=0;
    int holdercount=0;

    // private constructor to make Singleton class
    private ParkingSystem(String campus, Supervisor supervisor){
        this.campus=campus;
        this.supervisor=supervisor;
        zones = new ParkingZone[2];
        permitHolders = new PermitHolder[2];
    }

    public static ParkingSystem getInstance(String campus, Supervisor supervisor){
        if(instance==null){
            instance = new ParkingSystem(campus,supervisor);
            return instance;
        }
        else{
            System.out.println("Warning: ParkingSystem instance already exists. Returning existing instance.");
            return instance;
        }
    }

    public void addZone(ParkingZone z){
        if (zonecount < zones.length) {
            zones[zonecount++] = z;
        } else {
            System.out.println("Error: Cannot add more zones. Limit reached.");
        }
    }

    public void addPermitHolder(PermitHolder p){
        if (holdercount < permitHolders.length) {
            permitHolders[holdercount++] = p;
        } else {
            System.out.println("Error: Cannot add more permit holders. Limit reached.");
        }
    }

    public String toString(){

        String output = "Campus: " + campus + "\n";
        output += "Supervisor: " + supervisor + "\n";

        output += "Zones: [";
        for (int i = 0; i < zonecount; i++){
            ParkingZone zone = zones[i];
            output += zone.toString();
            if (i != zonecount - 1){
                output += ",\n        ";
            }
        }
        output += "]\n";

        output += "Permit Holders: [";
        for(int i = 0; i < holdercount; i++){

            output += permitHolders[i].toString();
            if(i != holdercount - 1){
                output += ", ";
            }
        }
        output += "]";
        return output;
    }





































}
