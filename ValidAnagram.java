import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "listen", t = "silent";
        char[] a = s.toCharArray(), b = t.toCharArray();
        Arrays.sort(a); Arrays.sort(b);
        System.out.println(Arrays.equals(a,b));
    }
}