package lab3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Room room = new Room();
        room.addToy(new Car("Car", "Big", "BMW"));
        room.addToy(new Car("Car", "Small", "Mrcedes"));
        room.addToy(new Doll("Barbie", "Medium", "girl"));
        room.addToy(new Doll("Ken", "Small", "boy"));
        room.addToy(new Ball("Ball", "Small", "Red"));
        room.addToy(new Ball("Ball", "Big", "Blue"));


        boolean isTrue = true;
        while (isTrue) {
            System.out.println("Menu:\n1.Show toys in room\n2.Sort toys by parameter\n3.Search toy\n4.Exit");
            switch (scanner.nextLine()) {
                case ("1"):
                    room.toysInRoom();
                    break;
                case ("2"):
                    System.out.println("input parameter: ");
                    String param = scanner.nextLine();
                    room.sortToysByParameter(param);
                    break;
                case ("3"):
                    List<String> answers = new ArrayList<>();
                    List<String> answers_strings = new ArrayList<>(Arrays.asList("name", "size", "brand", "gender", "color"));
                    for(int i=0; i<5; i++) {
                        System.out.println("input " + answers_strings.get(i) + ", leave blank if the parameter is not needed:");
                        answers.add(scanner.nextLine());
                        answers.set(i, (answers.get(i).isEmpty()) ? null : answers.get(i));
                    }
                    List<Toy> result = room.searchToys(answers.get(0), answers.get(1), answers.get(2), answers.get(3), answers.get(4));
                    System.out.println(result);
                    break;
                case ("4"):
                   isTrue = false;
                   break;
            }
        }

    }
}
