import java.io.*;
import java.util.Scanner;

public class Student {
    int rollno;
    static int no = 0;
    String name;
    float percentage;

    Student() {
    }

    Student(int rollno, String name, float percentage) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
        no++;
    }

    void display() {
        System.out.println(rollno + "\t" + name + "\t" + percentage + "\n");

    }

    public static void main(String args[]) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter how many Students: ");
        n = sc.nextInt();
        Student s[] = new Student[n];
        System.out.println("\nEnter details:");
        for (i = 0; i < n; i++) {
            System.out.println("\n Enter rollno: ");
            int rollno = sc.nextInt();
            System.out.println("\nEnter name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("\nEnter percentage: ");
            float percentage = sc.nextFloat();
            s[i] = new Student(rollno, name, percentage);
            System.out.println("no. of objects are created:" + s[i].no);
        }
        System.out.println("\nEntered Students details are:\nrollno\tname\tpercentage");
        for (i = 0; i < n; i++) {
            s[i].display();
        }
        for (i = 0; i < n; i++) {
            for (int j = 0; j > n - i - 1; j++) {
                if (s[j].percentage < s[j + 1].percentage) {
                    Student t = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = t;
                }
            }
        }
        System.out.println("\nSorted Students details are: \nrollno\tname\tpercentage\n");
        for (i = 0; i < n; i++) {
            s[i].display();
        }
    }
}