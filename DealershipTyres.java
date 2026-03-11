import java.util.Scanner;

public class DealershipTyres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of dealerships: ");
        int dealerships = sc.nextInt();

        int[][] data = new int[dealerships][2];

        for (int i = 0; i < dealerships; i++) {
            System.out.print("Enter no of cars and bikes in dealership " + (i + 1) + ": ");
            data[i][0] = sc.nextInt(); // cars
            data[i][1] = sc.nextInt(); // bikes
        }

        System.out.println("There are total " + dealerships + " dealerships");

        for (int i = 0; i < dealerships; i++) {
            int cars = data[i][0];
            int bikes = data[i][1];
            int tyres = (cars * 4) + (bikes * 2);

            System.out.println("dealerships" + (i + 1) + " contains " + cars + " cars and " + bikes + " bikes");
            System.out.println("Total number of tyres in dealerships" + (i + 1) + " is " + tyres);
        }
    }
}