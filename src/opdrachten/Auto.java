package opdrachten;

import javax.lang.model.element.NestingKind;

public class Auto {
    //attributes

    private String brand;
    private Garage garage = new Garage();

    //constructors
    public Auto(String brand, Garage garage){
        this.brand=brand;
        this.garage=garage;
    }
    public Auto(Auto auto){
        this.brand = auto.brand;
        this.garage = auto.garage;
    }
    public Auto (String brand){
        this.brand = brand;
    }

    //getters and setters
    public String getBrand(){
        return brand;
    }

    public Garage getGarage(){
        return garage;
    }
    public void setGarage(Garage garage) {
        this.garage = garage;
    }

   //print method
    public String printAuto(){
        return "The car brand is " + brand + ".";
    }
    public String printAuto1(){
        return "The car brand is " + brand + " and it comes from the garage " + garage.getName() + ".";


    }
}

