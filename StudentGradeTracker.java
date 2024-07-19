import java.util.Scanner;
public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number Of Students : ");
        int Students = scan.nextInt();
        float[] Grades = new float[Students];
        for (int i = 0; i < Students; i++) {
            System.out.println("Enter Student " + (i + 1) + " Grade : ");
            Grades[i] = scan.nextFloat();
        }
        scan.close();
        float TotalGrade = 0;
        float lowest = Grades[0];
        float highest = Grades[0];
        for (int i = 0; i < Students; i++) {
            TotalGrade += Grades[i];
            if (Grades[i] < lowest) {
                lowest = Grades[i];
            } else if (Grades[i] > highest) {
                highest = Grades[i];
            }
        }
        float AverageGrade = TotalGrade / Students;
        System.out.println("Average Of Given Grades is  " + AverageGrade);
        System.out.println("Highest of Given Grades is  " + highest);
        System.out.println("Lowest Of Given Grades is   " + lowest);
    }
}