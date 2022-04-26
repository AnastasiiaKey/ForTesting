package Tasks_It_One;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class From_Channel {
    public static void main(String[] args) {
        int i1 = 1;
        int[] x = {4,1,2,4,4,2};
        List<Integer> i2 = new ArrayList<>();
        i2.add(i1);

        fun(i1,i2);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println(numberOfIdenticalPairs(x));

    }

    private static void fun (int i1, List <Integer> i2) {
        i1++;
        i2.add(2);
    }
    public static int numberOfIdenticalPairs(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    res++;
                }
            }
        }
        return res;
    }
}
