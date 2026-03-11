import java.util.*;

public class SecondElements {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) set.add(num);
        if (set.size() < 2) {
            System.out.println("Second Smallest : -1");
            System.out.println("Second Largest : -1");
        } else {
            System.out.println("Second Smallest : " + set.toArray()[1]);
            System.out.println("Second Largest : " + set.toArray()[set.size()-2]);
        }
    }
}