public class ExpressionAssessment{

    public static void main(String[] args){
        
        six();

    }

    private static void one(String[] args){

        int a, b, c ;
        a = 3;
        b = 2;
        c = ((a*2) + (2*a*b)- 4*(b+a))/2;
        System.out.println("1.) " + c);

    }

    private static void two(String[] args){

        int x,y,z;
        x = 1;
        y = -2;
        z = x*y + (x-y) % 3 + 4;
        System.out.println("2.) " + z);


    }
    private static void three(String[] args){

        int a,b,z;
        a = 10;
        b = 3;
        z = a/(8-b) % 2*4*(b-a) + 5;
        System.out.println("3.) "+ z);

    }

    private static void four(String[] args){

        int i,m,p;
        i = 10;
        m = 3;
        p = i+ ++m - i++ + 4;
        System.out.println("4.) "+ p);

    }
    private static void five(String[] args){

        int x, y,z;
        x = 2;
        y = -5;
        z = 2*y-- + ++x + --y - x++ +3;
        System.out.println("5.) "+ z);

    }

    private static void six(){
        int x = 4;
        int y = ++x + x++ + x++;
        System.out.println(y);
    }
}
