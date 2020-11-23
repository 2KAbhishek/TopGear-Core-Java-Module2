import java.util.Scanner;
import java.util.Arrays;

public class StudenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stuID, name, contact, course;
        double fees, sum = 0.0;
        int n = 5;

        Student s[] = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nFor Student " + (i + 1));

            System.out.print("Enter Student ID: ");
            stuID = sc.next();
            System.out.print("Enter Student Name: ");
            name = sc.next();
            System.out.print("Enter Student Course: ");
            course = sc.next();
            System.out.print("Enter Student Contact No: ");
            contact = sc.next();
            System.out.print("Enter Student Fees: ");
            fees = sc.nextDouble();

            s[i] = new Student(stuID, name, contact, course, fees);
            sum += s[i].getFees();
        }
        sc.close();

        Arrays.sort(s, new StudentCourseCmp());

        System.out.println("\nThe Student details are as follows:\n");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }
        System.out.println("Total Fees: " + sum);
    }

}
