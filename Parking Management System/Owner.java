public class Owner extends Person{

    public Owner(String name){
        super(name);
    }

    // copy constructor for deep copy
    public Owner(Owner other) {
        super(other.name);
    }

    public String toString() {
        return "[Name: " + name + "]";
    }
}
