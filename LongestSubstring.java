import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        String s="pwwkew";
        Set<Character> set=new HashSet<>();
        int l=0,res=0;
        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))) set.remove(s.charAt(l++);
            set.add(s.charAt(r));
            res=Math.max(res,r-l+1);
        }
        System.out.println(res);
    }
}