import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class S1 {
    static void commonSubstring(List<String> a, List<String> b) {
        String[] a2 = new String[a.size()];
        String[] b2 = new String[b.size()];
        String[] a1 = a.toArray(a2);
        String[] b1 = b.toArray(b2);
        List<String> ans = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < a1.length; i++) {
            String[] temp1 = a1[i].split("");
            String[] temp2 = a1[i].split("");
            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            for (int j = 0; j < temp1.length; j++) {
                list1.add(temp1[j]);
            }
            for (int j = 0; j < temp2.length; j++) {
                list2.add(temp2[j]);
            }

            for (String c : list1) {
                if (list2.contains(c)) {
                    flag = true;
                } else {
                    continue;
                }
            }
            if (flag == true) {
                ans.add("YES");
                flag = false;
            } else {
                ans.add("NO");
            }

        }
        for (String l : ans) {
            System.out.println(l);
        }


    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("hello");
        list1.add("hi");
        list2.add("world");
        list2.add("bye");
        commonSubstring(list1, list2);
    }
}
