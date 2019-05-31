package 数学;

/*
最大公约数 最小公倍数
 */
public class GcdandLcm {

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }


}
