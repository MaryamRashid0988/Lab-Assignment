public class PermitHolder extends Person {
    private String ID;
    static int count=0;

    public PermitHolder(String name) {
        super(name);
        this.ID = "P" + ++count;

    }

    public String getID(){
        return ID;
    }

    public String toString() {
        return "[Name: " + name + ", Permit ID: " + ID + "]";
    }
}
