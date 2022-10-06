package mentorSession1005;

import java.util.Stack;

public class Solution2 {

    public static void main(String[] args) {

        int[] arr = {10,4,6,3,5};
        find(arr);
    }

    public static void find(int[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]) {
                stack.pop();
                stack.push(arr[i]);
            }
            else stack.push(arr[i]);
        }
        System.out.println(stack);
    }
}
