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

        StudentInfo s = new StudentInfo(scString.nextLine(),
                scInt.nextByte(), scString.nextLine(),
                scString.nextLine(), scInt.nextInt(),
                scString.nextLine(),scString.nextLine());
        AcadInfo a = new AcadInfo(scDouble.nextDouble(), scDouble.nextDouble(), scDouble.nextDouble(), scDouble.nextDouble());
        EmployeeInfo e = new EmployeeInfo(scString.nextLine(), scString.nextLine(), scString.nextLine());

        StudentInfo s1 = new StudentInfo(scString.nextLine(),
                scInt.nextByte(), scString.nextLine(),
                scString.nextLine(), scInt.nextInt(),
                scString.nextLine(),scString.nextLine());
        AcadInfo a1 = new AcadInfo(scDouble.nextDouble(), scDouble.nextDouble(), scDouble.nextDouble(), scDouble.nextDouble());
        EmployeeInfo e1 = new EmployeeInfo(scString.nextLine(), scString.nextLine(), scString.nextLine());

        s.displayStudent();
        e.displayEmployee();
        a.displayEducDetails();

        System.out.println("NEXT STUDENT\n");

        s1.displayStudent();
        e1.displayEmployee();
        a1.displayEducDetails();

    }
}