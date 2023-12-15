package gradecalculator;

import java.util.*;

public class GradeCalculator {
    //Main Driver Class
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //    taking input from user
        System.out.print("Enter the number of students: ");
        int num = sc.nextInt();
        int[] grades = new int[num];

        // Input grades for each student
        for (int i = 0; i < num; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }

        //there are methods
        double average = findAverage(grades);
        int highestGrade = findHighest(grades);
        int lowestGrade = findLowest(grades);

        // for printing the output
        System.out.println("\nAverage grade: " + average);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);

        sc.close();
    }
    
    //for finding the Average
     private static double findAverage(int[] grades) {
        if (grades.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }
    
     //for finding the Highest Value
    private static int findHighest(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }
    
    //for finding the Minimun Value
    private static int findLowest(int[] grades) {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
