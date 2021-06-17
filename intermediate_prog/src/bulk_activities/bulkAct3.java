package bulk_activities;

public class bulkAct3 {
    public static void main(String[] args) {
        firstHalf();
        System.out.println("----------");
        secondHalf();
        System.out.println("----------");
        triangle();
        System.out.println("----------");
        inverseTriangle();
    }

    public static void firstHalf(){
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("A");
            }
            System.out.println();
        }

        for (int i = 0; i <= 5 ; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("A");
            }
            System.out.println();
        }
    }

    public static void secondHalf(){
        for (int i = 0; i < 5 ; i++) {
            for (int j = 4; j > i; j--){
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("B");
            }
            System.out.println();
        }

        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 4-i; j > 0; j--){
                System.out.print("B");
            }
            System.out.println();
        }
    }

    public static void triangle(){
        for (int i = 0; i < 5 ; i++) {
            for (int j = 4; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i*2 ; j++) {
                System.out.print("C");
            }
            System.out.println();
        }
    }

    public static void inverseTriangle(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 4*2-i*2; j >= 0 ; j--) {
                System.out.print("D");
            }
            System.out.println();
        }
    }

}
