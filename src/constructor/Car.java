package constructor;

public class Car {
    private String plate;
    private int model;

    public Car(String plate, int model) {
        this.plate = plate;
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}