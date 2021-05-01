package activity_0.packaging.student_package.employee_package;

public class EmployeeInfo {
    private final String name, faculty, position;
    public EmployeeInfo(String name, String faculty, String position){
         this.name = name;
         this.faculty = faculty;
         this.position = position;
    }

    public void displayEmployee(){
        System.out.println("EMPLOYEE'S DETAILS"+
                            "\nEmployee Name: " + this.name +
                            "\nDesignation: " + this.faculty +
                            "\nAcademic Position: " + this.position + "\n");
    }
}
