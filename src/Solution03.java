
/*
找出数组中重复的数字。
在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
请找出数组中任意一个重复的数字。

示例 1：
输入：
[2, 3, 1, 0, 2, 5, 3]
输出：2 或 3

限制：
2 <= n <= 100000
 */
public class Solution03 {
    public int findRepeatNumber(int[] nums) {
        //借鉴的。下面的是桶排序？
        int[] arr = new int[nums.length];
        //局部变量 数组的元素默认值是0
        for (int i = 0;i < nums.length; i++) {
            arr[nums[i]]++;
            if (arr[nums[i]] > 1)
                return nums[i];
        }
        return -1;// nums元素范围是0~n-1 所以异常返回值可以是-1
    }
}
