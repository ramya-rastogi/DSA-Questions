import java.util.Scanner;

public class MaxMarksPerSemester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of semester: ");
        int semesters = sc.nextInt();

        for (int i = 1; i <= semesters; i++) {
            System.out.print("Enter no of subjects in " + i + " semester: ");
            int subjects = sc.nextInt();

            int maxMark = -1;
            System.out.print("Marks obtained in semester " + i + ": ");
            for (int j = 0; j < subjects; j++) {
                int mark = sc.nextInt();
                if (mark < 0 || mark > 100) {
                    System.out.println("You have entered invalid mark.");
                    return;
                }
                if (mark > maxMark) {
                    maxMark = mark;
                }
            }
            System.out.println("Maximum mark in " + i + " semester: " + maxMark);
        }
    }
}