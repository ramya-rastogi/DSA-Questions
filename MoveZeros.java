import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int index=0;
        for (int num:nums) if (num!=0) nums[index++]=num;
        while(index<nums.length) nums[index++]=0;
        System.out.println(Arrays.toString(nums));
    }
}