package BookMain;

public class Author1 {
    private String name, email, gender;

    public Author1(String name, String email, String gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getGender(){
        return this.gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void print(){
        System.out.println("AUTHOR : " + getName());
        System.out.println("GENDER : " + getGender());
        System.out.println("E-MAIL : " + getEmail());
        System.out.println();
    }
}
