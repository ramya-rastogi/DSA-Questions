import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        for (int i=0,j=arr.length-1;i<j;i++,j--) {
            int temp=arr[i]; arr[i]=arr[j]; arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}