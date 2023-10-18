package lab4;

import java.io.*;
import java.util.Stack;

public class Lab4 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("out/production/labs/lab4/input.txt"));
            Stack<String> stack = new Stack<>();
            String line;

            while ((line = reader.readLine()) != null) {
                stack.push(line);
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("out/production/labs/lab4/input.txt"));
            while (!stack.isEmpty()) {
                writer.write(stack.pop());
                writer.newLine();
            }
            writer.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
