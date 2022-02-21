package opdrachten;

public class Garage {
//attribute
    private String name;
   // private String printText;
//constructor
    public Garage(String name) {
        this.name=name;
    }
    public Garage(){
        this(null);
    }
//getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//print method
    public String printGarage() {
        return "This garage is named " + name + ".";
    }

}
