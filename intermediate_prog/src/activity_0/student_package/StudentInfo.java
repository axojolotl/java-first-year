package activity_0.student_package;

public class StudentInfo {
    //kung kailangan int ang age, contactNumber gumamit nalang ng parseInt();
    // e.g. int a = Integer.parseInt(age);
    String name, gender, address, motherName, fatherName;
    int contactNumber, age;

    public StudentInfo(String name, int age,
                            String gender, String address,
                            int contactNumber, String motherName,
                            String fatherName){
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
