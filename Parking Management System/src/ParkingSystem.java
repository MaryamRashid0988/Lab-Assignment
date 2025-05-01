public class ParkingSystem {
    private static ParkingSystem instance;
    private String campus;
    private Supervisor supervisor;
    private ParkingZone[] zones;
    private PermitHolder[] permitHolders;
    int zonecount=0;
    int holdercount=0;

    // private constructor to make Singleton class
    private ParkingSystem(String Campus, Supervisor supervisor){
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
        zones[++zonecount]=z;
    }
    public void addPermitHolder(PermitHolder p){
        permitHolders[++holdercount]=p;
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
