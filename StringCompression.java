public class StringCompression {
    public static void main(String[] args) {
        String s = "aabbbbeeeeffggg";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i=1;i<=s.length();i++) {
            if (i==s.length() || s.charAt(i)!=s.charAt(i-1)) {
                sb.append(s.charAt(i-1)).append(count);
                count=1;
            } else count++;
        }
        System.out.println(sb.toString());
    }
}