package lab3;

import java.util.*;

public class Room {
    private List<Toy> toys = new ArrayList<>();

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void sortToysByParameter(String parameter) {
        if (parameter.equals("size")) {
            toys.sort(Comparator.comparing(Toy::getSize));
        } else if (parameter.equals("name")) {
            toys.sort(Comparator.comparing(Toy::getName));
        } else {
            System.out.println("Incorrect parameter: " + parameter);
        }
    }

    public List<Toy> searchToys(String name, String size, String brand, String gender, String color) {
        List<Toy> result = new ArrayList<>();

        for (Toy toy : toys) {
            if (name != null && !toy.name.equals(name)) continue;
            if (size != null && !toy.size.equals(size)) continue;

            if (toy instanceof Car) {
                Car car = (Car) toy;
                if (brand != null && !car.  getBrand().equals(brand)) continue;
            } else if (toy instanceof Doll) {
                Doll doll = (Doll) toy;
                if (gender != null && !doll.getGender().equals(gender)) continue;
            } else if (toy instanceof Ball) {
                Ball ball = (Ball) toy;
                if (color != null && !ball.getColor().equals(color)) continue;
            }

            result.add(toy);
        }

        return result;
    }

    public void toysInRoom() {
        System.out.println("Toys in this room:");
        toys.forEach(System.out::println);
    }
}
