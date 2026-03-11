public class ReverseString {
    public static void main(String[] args) {
        String s = "Capgemini";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse().toString());
    }
}