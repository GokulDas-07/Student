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
        System.out.println("Enter option: \n 1.View Student details \n 2.Search Student \n 3.Delete Student");
        int option= input.nextInt();

        switch (option){
            case 1:
                for (int i=0;i<list.size();i++)
                {
                    System.out.println("Employee "+ (i+1)+" details are:");
                    System.out.println("Roll Number: "+list.get(i).rollno);
                    System.out.println("Name: "+list.get(i).name);
                    System.out.println("Admission number: "+list.get(i).admissionno);
                    System.out.println("College: "+list.get(i).college);
                    System.out.println("\n");
                }
                break;



        }
    }
}

