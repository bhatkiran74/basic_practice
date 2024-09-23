import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String s = "abbcccdddd";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }
}