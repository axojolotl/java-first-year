package Others.player;

public class Player {

    private String username;
    private String email;
    protected String role;
    public String psswd;

    public Player(String username, String email, String role, String psswd){
        this.username = username;
        this.email = email;
        this.psswd = psswd;
        greet();
    }

    public Player(){
        this.username = "Default";
        this.email = "Default";
        this.psswd = "asdkjaslk123";
        greet();
    }

    public Player(String username){
        this.username = username;
        this.email = "Default";
        this.psswd = "aksjdlkasdj";
        greet();
    }

    public Player(String username, String role){
        this.username = username;
        this.email = "Default";
        this.psswd = "aslkjdaskjd";
        greet();
    }

    private void greet(){
        System.out.println("Hello " + username);
    }

    public void setName(String newName){
        this.username = newName;
    }

    public void getStatus(){
        System.out.println(username);
        System.out.println(email);
    }

    public void setPass(String psswd){
        this.psswd = psswd;
    }
}

