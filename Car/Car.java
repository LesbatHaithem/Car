package Car;   // creation d'un dossier Car dans le repetoire src de projet java in Vs code
// veut dire que ce dossier la est un package

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return make + " " + model + " (" + year + ")";

    }
    
}
