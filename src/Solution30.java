/*Java栈中嵌套栈： 外部栈就是存放操作数的，内部栈用于存放 每次push后 最小值的下标。
 当pop时，判断是否需要将最小值下标返回上一次的位置。如果需要返回，将内部栈pop即可。
 */

public class Solution30 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());//   --> 返回 -3.
        minStack.pop();//
        System.out.println(minStack.top());//      --> 返回 0.
        System.out.println(minStack.min());//   --> 返回 -2.
    }
}

class MinStack {
    int[] nums = null;
    int front = -1;
    int[] minStack = null;
    int minFront = -1;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        nums = new int[20000];
        int front = -1;//指向头部，一旦输入就会指向栈顶节点
        minStack = new int[2000];//存放最小值下标的栈的数组
        int minFront = -1;//指向最小值下标的栈的栈顶
    }

    public void push(int x) {
        front++;
        nums[front] = x;//正常的入栈操作
        if (front == 0 ||
                nums[minStack[minFront]] > nums[front])
            //遇到栈中只有一个元素、入栈的元素小于上一个最小值就记录现有的最小值下标
            minStack[++minFront] = front;//也是入栈操作
    }

    public void pop() {
        if (minStack[minFront] == front)//如果出栈的是当前最小值，就将最小值回溯到上一个最小值记录
            minFront--;
        front--;
    }

    public int top() {
        return nums[front];
    }

    public int min() {
        return nums[minStack[minFront]];//返回现在的最小值
    }
}