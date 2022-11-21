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
    }
}

