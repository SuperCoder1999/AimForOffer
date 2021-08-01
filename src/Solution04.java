
/*
    剑指 Offer 04. 二维数组中的查找
    https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 */
public class Solution04 {
    public static void main(String[] args) {
        int[][] arr = {{1,1}};
        System.out.println(Find(2,arr));
    }

    public static boolean Find(int target, int [][] array) {
        int x = array[0].length - 1;
        int y = 0;
        while (x >= 0 && y <= array.length - 1) {
            if (array[y][x] < target) {
                for (int i = 0; i < array.length; i++) {
                    if (target == array[i][x])
                        return true;
                }
            }
            else if (array[y][x] > target) {
                for (int i = array[0].length - 1; i >= 0; i--) {
                    if (target == array[y][i])
                        return true;
                }
            }
            else return true;
            x--;
            y++;
        }
        return false;
    }
}