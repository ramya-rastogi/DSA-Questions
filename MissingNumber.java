public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int n = nums.length;
        int sum = n*(n+1)/2;
        int actual = 0;
        for (int num : nums) actual += num;
        System.out.println(sum - actual);
    }
}