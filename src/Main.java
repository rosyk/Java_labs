import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "this is a sample text";
        int len = text.length();
        Map<String, Integer> substringCounts = new HashMap<>();

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String substring = text.substring(i, j);
                if (substringCounts.containsKey(substring)) {
                    substringCounts.put(substring, substringCounts.get(substring) + 1);
                } else {
                    substringCounts.put(substring, 1);
                }
            }
        }

        String res = Collections.max(substringCounts.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("substring: \""+res+"\"");
    }
}
