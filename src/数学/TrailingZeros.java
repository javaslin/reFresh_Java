package 数学;

/*
统计阶乘尾部有多少个 0
 */
public class TrailingZeros {

    public int trailingZeros(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeros(n / 5);

    }
}
