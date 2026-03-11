import java.util.*;

public class IntersectionArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        Set<Integer> set1 = new HashSet<>();
        for (int num:nums1) set1.add(num);
        Set<Integer> res = new HashSet<>();
        for (int num:nums2) if (set1.contains(num)) res.add(num);
        System.out.println(res);
    }
}