import java.util.*;

public class FirstUniqueIndex {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c-'a']++;
        for (int i=0;i<s.length();i++) if (freq[s.charAt(i)-'a']==1) {
            System.out.println(i); return;
        }
        System.out.println(-1);
    }
}