package Others.player;

public class Wizard extends Player {
    int Level;
    int intelligence = 10;
    
    public Wizard(){
        super();
    }
    public Wizard(String username){
        super(username);
        super.role = "Wizard";
    }
    public Wizard(String username, String email){
        super(username,email);
        super.role = "Wizard";
    }
    public Wizard(String username, String email, int Level){
        super(username,email);
        this.Level = Level;
    }

    public void getStatus(){
        super.getStatus();
        System.out.println(role);
    }
}
