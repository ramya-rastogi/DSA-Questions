import java.util.*;

public class CountPairs {
    public static void main(String[] args) {
        int[] arr = {1,5,7,-1,5};
        int target = 6;
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        for (int num:arr) {
            count += map.getOrDefault(target-num,0);
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(count);
    }
}