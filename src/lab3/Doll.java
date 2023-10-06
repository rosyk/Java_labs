package lab3;

public class Doll extends Toy {

    private String gender;

    public Doll(String name, String size, String gender) {
        super(name, size);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return size + " doll, name:  " + name + " gender: " + gender;
    }
}
