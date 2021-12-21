package Others.gun;

public class SemiAutomatic extends FullAutomatic{ //yes this makes no sense, just an example
    boolean isScope;
    int ammo;

    public SemiAutomatic(String material, int ammo, String name, boolean isScope){
        super(material, ammo, name);
        this.isScope = isScope;
    }

    public void getName(){
        System.out.println(this.name);
        System.out.println("This is a semi-auto");
    }

    public void getAmmo(){
        System.out.println(this.ammo);
    }

    public void fire(){
        this.ammo -= 2;
    }
    
    public void reload(){
        this.ammo = 20;
    }
    
}
