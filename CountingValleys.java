public class CountingValleys {
    public static void main(String[] args) {
        String path = "UDDDUDUU";
        int level = 0, valleys = 0;
        for (char step : path.toCharArray()) {
            if (step == 'U') level++;
            else level--;
            if (step == 'U' && level == 0) valleys++;
        }
        System.out.println(valleys);
    }
}