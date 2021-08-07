public class Solution15 {
    public static void main(String[] args) {
        int res = hammingWeight(0b11111111111111111111111111111101);
        System.out.println(res);
    }

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {//错误原因：i < 31
            if (((n >>> i) & 1) == 1)
                count++;
        }
        return count;
    }
}