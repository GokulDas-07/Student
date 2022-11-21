import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 5;
        ArrayList<studentDetails> list = new ArrayList<studentDetails>();
        for (int i = 1; i <= count; i++) {
            System.out.println("Enter details of Student " + i + ":");
            System.out.print("Roll Number:");
            int rollno = input.nextInt();
            System.out.print("Name:");
            String name = input.next();
            System.out.print("Admission Number:");
            int admissionno = input.nextInt();
            System.out.print("College:");
            String college = input.next();
            System.out.println("\n");

            studentDetails stud = new studentDetails(rollno, admissionno, name, college);
            list.add(stud);

        }
        System.out.println("Enter option: \n 1.View Student details \n 2.Search Student \n 3.Delete Student \n 4.Exit");
        int option= input.nextInt();

        switch (option) {
            case 1:
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("Employee " + (i + 1) + " details are:");
                    System.out.println("Roll Number: " + list.get(i).rollno);
                    System.out.println("Name: " + list.get(i).name);
                    System.out.println("Admission number: " + list.get(i).admissionno);
                    System.out.println("College: " + list.get(i).college);
                    System.out.println("\n");
                }
                break;

            case 2:
                System.out.print("Enter Admission Number:");
                int admno = input.nextInt();
                for (studentDetails s : list) {
                    if (admno == s.admissionno) {
                        System.out.println("Student with Admission number " + admno + " is " + s.name);
                    } else {
                        System.out.println("No student found");
                    }
                }
                break;

            case 3:
                System.out.print("Enter the admission number:");
                int admno1 = input.nextInt();
                for (studentDetails s : list) {
                    if (admno1 == s.admissionno) {
                        list.remove(s);
                    }
                }
                break;

            case 4:
                System.out.println("Exiting.....");
                System.exit(0);








        }
    }
}

