import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S2 {
    static int countDuplicates(List<Integer> numbers) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : numbers) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                count++;
            }
        }
        return count;


    }
}
