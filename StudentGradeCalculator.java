
import java.util.*;
public class StudentGradeCalculator {
    public void StudentMarks() {

        System.out.println("Enter the no of subjects");
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int totalMarks = 0;

        for (int i = 1; i <= number; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            totalMarks += scn.nextInt();
        }
        double averagePercentage = (double) totalMarks / number;

        System.out.println("\n*** RESULTS ***");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%n", averagePercentage);

        // Grade calculation according to average percentage
        if (averagePercentage >= 75) {
            System.out.println("Grade: A");
        } else if (averagePercentage >= 65) {
            System.out.println("Grade: B");
        } else if (averagePercentage >= 55) {
            System.out.println("Grade: C");
        } else if (averagePercentage >= 45) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }



    }

    public static void main(String[] args){
        StudentGradeCalculator obj1= new StudentGradeCalculator();
        obj1.StudentMarks();

        System.out.println(obj1);
    }
}

