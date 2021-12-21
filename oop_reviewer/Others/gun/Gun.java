package Others.gun;

public abstract class Gun {
    String type = "Default";
    int ammo = 0;
    String material;

    public Gun(String material, int ammo){
        this.material = material;
        this.ammo = ammo;
    }

    public Gun(){
        this.material = "Wood";
        this.ammo = 10;
    }
    public abstract void getName();
    abstract void fire();
    abstract void reload();
    abstract void getAmmo();
}
