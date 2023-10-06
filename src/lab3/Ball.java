package lab3;

public class Ball extends Toy {

    private String color;

    public Ball(String name, String size, String color) {
        super(name, size);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return size + " " + name + ", color: " + color;
    }
}
