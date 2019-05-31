public class RecommendUsers {
    public static void main(String[] args) {
        RecommendUsers users = new RecommendUsers();
        int num = 5;
        int[] ks = new int[]{1, 2, 3, 3, 5};
        int groupcount = 3;
        int[] a1 = new int[]{1, 2, 1};
        int[] a2 = new int[]{2, 4, 5};
        int[] a3 = new int[]{3, 5, 3};
        int[] ans = users.getUsersCount(num, ks, groupcount, a1, a2, a3);
        for (int num1 : ans) {
            System.out.println(num1);

        }
    }

    public int[] getUsersCount(int num, int[] ks, int groupcount, int[] a1, int[] a2, int[] a3) {
        int[] ans = new int[groupcount];
        ans[0] = getCount(ks, a1);
        ans[1] = getCount(ks, a2);
        ans[2] = getCount(ks, a3);
        return ans;
    }

    private int getCount(int[] nums1, int[] a) {
        int count = 0;
        for (int i = a[0]; i <= a[1]; i++) {
            if (nums1[i - 1] == a[2]) {
                count++;
            }
        }
        return count;
    }
}
