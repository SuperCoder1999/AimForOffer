import java.util.Arrays;

public class Solution06 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public static void main(String[] args) {
       /* ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);

        head.next = node1;
        node1.next = node2;
        //node2.next = node3;*/

        //测试head 为空时。
        ListNode head = null;
        int[] arr = reversePrint(head);
        /*  数组为 null 时，System.out.println(Arrays.toString(arrNull));输出为 null
        int[] arrNull = null;
        System.out.println(Arrays.toString(arrNull));*/
        System.out.println(Arrays.toString(arr));

    }
    public static int[] reversePrint(ListNode head) {

        /*  如果head = null ，则数组长度为 0 .而 返回类型是 String时 ，如果遇到长度为 0 的情况
        才返回 null
        if (head == null)
            return null;*/

        //暴力方法：
        //1. 第一次遍历链表，计算出链表长度，从而创建数组
        //2. 第二次遍历链表，从后向前存入数组

        //注意：该题中 head 存储数据、并且 该head 算作是节点
        ListNode temp = head;//辅助变量，用于遍历链表
        int count = 0;//计数器
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int[] arr = new int[count];
        int i = 0;//用于存储数组的辅助辅助变量
        temp = head;//重置辅助变量
        while (temp != null) {
            arr[--count] = temp.val;
            temp = temp.next;
        }
        return arr;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}