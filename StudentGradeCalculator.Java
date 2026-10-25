import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter score for Subject 1: ");
        double score1 = input.nextDouble();

        System.out.print("Enter score for Subject 2: ");
        double score2 = input.nextDouble();

        System.out.print("Enter score for Subject 3: ");
        double score3 = input.nextDouble();

        double total = score1 + score2 + score3;
        double average = total / 3;

        String grade;

        if (average >= 70) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else if (average >= 45) {
            grade = "D";
        } else if (average >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }

        System.out.println("\n--- STUDENT RESULTS ---");
        System.out.println("Name: " + name);
        System.out.println("Total Score: " + total);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Grade: " + grade);

        input.close();
    }
}