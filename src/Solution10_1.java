
/*
剑指 Offer 10- I. 斐波那契数列
https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 */
public class Solution10_1 {
    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fib(48));
        System.out.println(fib(49));
        System.out.println(fib(95));

    }
    public static int fib(int n) {
        int n0 = 0, n1 = 1;
        int res = 0;
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        for (int i = 2; i <= n; i++) {
            res = (int)((n0 + n1) % (1e7+9));
            n0 = n1;
            n1 = res;
        }
        return res;
    }
}
