import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of 5 subjects: ");

        int total = 0;
        for (int i = 1; i <= 5; i++) {
            total += sc.nextInt();
        }

        double percentage = total / 5.0;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else
            grade = "Fail";

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
