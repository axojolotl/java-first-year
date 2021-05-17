package activity_4;

import java.util.Scanner;

public class Act4Dre {
    static String name;

    static byte rc = -1, vc = -1, ec = -1, wc = -1;

    static final String[] roles = {"Ninja", "Night Elf", "Wasteland Hero"};

    static String[][] villages = {{"Hidden Leaf", "So do you wanna be a Hokage?"},{"Hidden Sand", "So hot in here..."},{"Hidden Rain", "I can feel your pain..."}},
                            elements = {{"Fire", "You're too hot to handle"}, {"Water", "Too slippery!"}, {"Earth", "So you're a tough guy eh?"}},
                            weapons = {{"Katana", "Ohhh... a samurai ninja..."}, {"Kunai", "Too typical but that's actually cool"}, {"Giant Shuriken", "Ohhh... that's pretty huge!"}};

    static void pl(String s){
        System.out.println(s);
    }

    static void p(String s){
        System.out.print(s);
    }

    static byte inp(){
        Scanner s = new Scanner(System.in);
        return s.nextByte();
    }

    static String snp(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    static void profile(){
        pl("So your name is " + name +
          "\nYou are a " + roles[rc-1] +
          "\nYou are from " + villages[vc-1][0] +
          "\nYour element is " + elements[ec-1][0] +
          "\nAnd your weapon is " + weapons[wc-1][0]);
    }
    
    static void roleMenu(){
        int i = 1;
        for (String s : roles) {
            pl(i + ". " + s);
            i++;
        }
    }

    static void roleChoice(){
        roleMenu();
        p("What character do you wish to create [1 to 3]? ");
        rc = inp();
    }

    static void villageChoice(){
        p("1. Hidden Leaf\n2. Hidden Sand\n3. Hidden Rain\nYour village: ");
        vc = inp();
        pl(villages[vc-1][1].toUpperCase());
    }

    static void elementChoice(){
        p("1. Fire\n2. Water\n3. Earth\nYour element: ");
        ec = inp();
        pl(elements[ec-1][1].toUpperCase());
    }

    static void weaponChoice(){
        p("1. Katana\n2. Kunai\n3. Giant Shuriken\nYour weapon: ");
        wc = inp();
        pl(weapons[wc-1][1].toUpperCase());
    }

    static void characterCreate(){
        p("So, What's your name? ");
        name = snp();
        pl("Welcome " + name + " to Kirin Tor!");
    }

    public static void run() {
        characterCreate();
        roleChoice();
        villageChoice();
        elementChoice();
        weaponChoice();
        profile();
    }
}