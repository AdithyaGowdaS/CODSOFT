import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for grading
        final int NUM_SUBJECTS = 5;
        final int MAX_MARKS_PER_SUBJECT = 100;

        // Input marks obtained in each subject
        System.out.println("Enter marks obtained in each subject (out of 100):");
        int totalMarks = 0;
        for (int i = 1; i <= NUM_SUBJECTS; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();

            // Validate marks (optional)
            if (marks < 0 || marks > MAX_MARKS_PER_SUBJECT) {
                System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
                return;
            }

            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / NUM_SUBJECTS;

        // Calculate grade based on average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F'; // Fail
        }

        // Display results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
