import java.util.*;

public class JD1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        List<String> list = new ArrayList<>();
        Map<int[], String> all1 = new HashMap<>();
        for (int i = 0; i < Integer.parseInt(num); i++) {
            list.add(sc.nextLine());

        }
        String str = sc.nextLine();
        Map<String, int[]> all = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                all.put(str.substring(i, j), new int[]{i, j});
            }
        }
        for (Map.Entry<String, int[]> entry : all.entrySet()) {
            if (list.contains(entry.getKey())) {
                all1.put(entry.getValue(), entry.getKey());
            }
        }
        int[][] d = new int[all1.size()][1];
        int c = 0;
        for (Map.Entry<int[], String> entry : all1.entrySet()) {
            d[c] = entry.getKey();
            c++;
        }
        Arrays.sort(d, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int end = d[0][1];
        for (int i = 0; i < d.length; i++) {
            if (d[i][0] <= end) {
                continue;
            }
            all1.remove(d[i]);
            end = d[i][1];
        }
        System.out.println(all1.size() + 1);

    }
}
