package mentorSession1005;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] array = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(array)));
    }
    public static int[] productExceptSelf(int[] nums){

        List<Integer> list = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if(j == i) continue;
                product *= nums[j];
            }
            list.set(i, product);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
