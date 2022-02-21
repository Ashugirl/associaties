package opdrachten;

public class GarageTester {

    public static void main(String[] args) {
        Garage garage = new Garage("Big Bill's Used Cars");
        Auto auto = new Auto("Ford");
        Auto auto1 = new Auto(new String("Tesla"),new Garage("Jacob bv"));

        //System.out.println("Garage: " + garage.getName());
        System.out.println(garage.printGarage());
        System.out.println(auto.printAuto());
        System.out.println(auto1.printAuto1());



    }
}
