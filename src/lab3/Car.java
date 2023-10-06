package lab3;

public class Car extends Toy {

    private String brand;

    public Car(String name, String size, String brand) {
        super(name, size);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return size + " " + name + ", brand: " + brand;
    }
}
