package activity_0.packaging.student_package;

public class StudentInfo {
    String name, gender, address, motherName, fatherName, age, contactNumber;

    public StudentInfo(String name, String age, String gender, String address,
                       String contactNumber, String motherName, String fatherName){
       this.name = name;
       this.age = age;
       this.gender = gender;
       this.address = address;
       this.contactNumber = contactNumber;
       this.motherName = motherName;
       this.fatherName = fatherName;
    }

    public void displayStudent(){
        System.out.println("STUDENT DETAILS" +
                            "\nStudent Name: " + this.name +
                            "\nAge: " + this.age +
                            "\nStudent Gender: " + this.gender +
                            "\nStudent Address: " + this.address +
                            "\nContact Number: " + this.contactNumber +
                            "\nMother's Name: " + this.motherName +
                            "\nFather's Name: " + this.fatherName +"\n");
    }
}
