package Others.gun;

public class FullAutomatic extends Gun{
    String type = "Full-auto";
    String name;

    public FullAutomatic(String material, int ammo, String name){
        super(material, ammo);
        this.name = name;
    }

    public FullAutomatic(){
        this.name = "Default";
        this.material = "wood";
        this.ammo = 40;
    }

    public void setName(String name){
        this.name = name;
    }

    public void getName(){
        System.out.println(this.name);
        System.out.println("This is a full-auto.");
    }

    public void fire(){
        this.ammo -= 3;
    }

    public void reload(){
        this.ammo = 50;
    }

    public void getAmmo(){
        System.out.print(this.ammo);
    }
}
