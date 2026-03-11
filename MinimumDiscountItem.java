import java.util.*;

public class MinimumDiscountItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        int[] discounts = new int[n];

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(",");
            String name = parts[0];
            int price = Integer.parseInt(parts[1]);
            int discountPercent = Integer.parseInt(parts[2]);

            int discountAmount = (price * discountPercent) / 100;
            names[i] = name;
            discounts[i] = discountAmount;
        }

        int minDiscount = Arrays.stream(discounts).min().getAsInt();

        for (int i = 0; i < n; i++) {
            if (discounts[i] == minDiscount) {
                System.out.println(names[i]);
            }
        }
    }
}