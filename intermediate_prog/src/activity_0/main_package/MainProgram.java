package activity_0.main_package;

import activity_0.employee_package.EmployeeInfo;
import activity_0.student_package.AcadInfo;
import activity_0.student_package.StudentInfo;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        Scanner scDouble = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        //STUDENT INFO
        System.out.print("STUDENT DETAILS\nStudent Name: ");
        String name = scString.nextLine();
        System.out.print("Age: ");
        int age = scInt.nextInt();
        System.out.print("Student Gender: ");
        String gender = scString.nextLine();
        System.out.print("Student Address: ");
        String address = scString.nextLine();
        System.out.print("Contact Number: ");
        int contactNumber = scInt.nextInt();
        System.out.print("Mother's Name: ");
        String motherName = scString.nextLine();
        System.out.print("Father's Name: ");
        String fatherName = scString.nextLine();

        StudentInfo s = new StudentInfo(name, age, gender, address, contactNumber, motherName, fatherName);

        //EMPLOYEE DETAILS
        System.out.print("Employee Name: ");
        String employeeName = scString.nextLine();
        System.out.print("Designation: ");
        String designation = scString.nextLine();
        System.out.print("Academic Position: ");
        String position = scString.nextLine();
        EmployeeInfo e = new EmployeeInfo(employeeName,designation,position);

        //STUDENT EDUCATIONAL DETAILS INFO
        System.out.print("quiz1: ");
        double q1 = scDouble .nextDouble();
        System.out.print("quiz2: ");
        double q2 = scDouble.nextDouble();
        System.out.print("midterm: ");
        double midterm = scDouble.nextDouble();
        System.out.print("finals: ");
        double finals = scDouble.nextDouble();
        System.out.println();

        AcadInfo a = new AcadInfo(q1, q2, midterm, finals);

        //SECOND STUDENT!!==================================================
        System.out.print("STUDENT DETAILS\nStudent Name: ");
        String name1 = scString.nextLine();
        System.out.print("Age: ");
        int age1 = scInt.nextInt();
        System.out.print("Student Gender: ");
        String gender1 = scString.nextLine();
        System.out.print("Student Address: ");
        String address1 = scString.nextLine();
        System.out.print("Contact Number: ");
        int contactNumber1 = scInt.nextInt();
        System.out.print("Mother's Name: ");
        String motherName1 = scString.nextLine();
        System.out.print("Father's Name: ");
        String fatherName1 = scString.nextLine();

        StudentInfo s1 = new StudentInfo(name, age, gender, address, contactNumber, motherName, fatherName);

        //EMPLOYEE DETAILS
        System.out.print("EMPLOYEE DETAILS\nEmployee Name: ");
        String employeeName1 = scString.nextLine();
        System.out.print("Designation: ");
        String designation1 = scString.nextLine();
        System.out.print("Academic Position: ");
        String position1 = scString.nextLine();
        EmployeeInfo e1 = new EmployeeInfo(employeeName,designation,position);

        //STUDENT EDUCATIONAL DETAILS INFO
        System.out.print("STUDENT EDUC DETAILS\nquiz1: ");
        double q11 = scDouble .nextDouble();
        System.out.print("quiz2: ");
        double q22 = scDouble.nextDouble();
        System.out.print("midterm: ");
        double midterm1 = scDouble.nextDouble();
        System.out.print("finals: ");
        double finals1 = scDouble.nextDouble();
        System.out.println();

        AcadInfo a1 = new AcadInfo(q11, q22, midterm1, finals1);

        s.displayStudent();
        e.displayEmployee();
        a.displayEducDetails();

        System.out.println("NEXT STUDENT\n");

        s1.displayStudent();
        e1.displayEmployee();
        a1.displayEducDetails();
    }
}
