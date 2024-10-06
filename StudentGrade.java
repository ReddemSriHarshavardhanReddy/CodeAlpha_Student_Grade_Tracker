package studentgrade;

import java.util.*;
public class StudentGrade {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of subjects:");
        int n = sc.nextInt();

        float[] marks = new float[n];
        float total = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            marks[i] = sc.nextFloat();
            total += marks[i];
        }

        
        float average = total / n;

        float highest = marks[0];
        float lowest = marks[0];
        
        for (int i = 1; i < n; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        System.out.println("\n--- Marks Summary ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
    }
}