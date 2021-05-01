package activity_0.packaging.student_package.main_package;

import activity_0.packaging.student_package.*;
import activity_0.packaging.student_package.employee_package.EmployeeInfo;
import java.util.Scanner;

public class MainProgram {
    public static void run() {
        Scanner sD = new Scanner(System.in);
        Scanner sS = new Scanner(System.in);

        StudentInfo s = new StudentInfo(sS.nextLine(), sS.nextLine(), sS.nextLine(), sS.nextLine(), sS.nextLine(), sS.nextLine(),sS.nextLine());
        
        AcadInfo a = new AcadInfo(sD.nextDouble(), sD.nextDouble(), sD.nextDouble(), sD.nextDouble());
        
        EmployeeInfo e = new EmployeeInfo(sS.nextLine(), sS.nextLine(), sS.nextLine());

        StudentInfo s1 = new StudentInfo(sS.nextLine(), sS.nextLine(), sS.nextLine(), sS.nextLine(), sS.nextLine(), sS.nextLine(),sS.nextLine());
        
        AcadInfo a1 = new AcadInfo(sD.nextDouble(), sD.nextDouble(), sD.nextDouble(), sD.nextDouble());
        
        EmployeeInfo e1 = new EmployeeInfo(sS.nextLine(), sS.nextLine(), sS.nextLine());

        s.displayStudent();
        e.displayEmployee();
        a.displayEducDetails();

        System.out.println("NEXT STUDENT\n");

        s1.displayStudent();
        e1.displayEmployee();
        a1.displayEducDetails();
    }
}
