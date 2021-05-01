package activity_0.packaging.student_package;
import java.util.concurrent.ThreadLocalRandom;

public class AcadInfo {
    public final double quiz1, quiz2, midterm, finals, average;
    private final int attendance, studentNumber;

    public AcadInfo(double quiz1, double quiz2, double midterm, double finals){
        this.attendance = ThreadLocalRandom.current().nextInt(80, 100 + 1);
        this.studentNumber = ThreadLocalRandom.current().nextInt(10001,  29999 + 1);
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.midterm = midterm;
        this.finals = finals;
        this.average = (this.quiz1+this.quiz2+this.midterm+this.finals)/4;
    }

    public void displayEducDetails(){
        System.out.println("STUDENT EDUCATIONAL DETAILS" +
                            "\nStudent Number: " + this.studentNumber +
                            "\nStudent Grade Average: " +  this.average +
                            "\nStudent Attendance: " + this.attendance + "%\n");
    }
}
