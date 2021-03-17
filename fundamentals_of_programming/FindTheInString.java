
//import java.util.Scanner;

public class FindTHEInString {
    public void execute(){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter sentence: ");
//        String sentence = sc.nextLine().toLowerCase();

        String sentence = "The example program can count the number of tHE THE. ThEfore, even these words can count as THE.".toLowerCase();
        String[] sentenceArray = sentence.split("");

        int ctr = 0;

        for(int i = 0; i < sentence.length(); i++){
            if(sentenceArray[i].equals("t")){
                if(sentenceArray[++i].equals("h")){
                    if(sentenceArray[++i].equals("e")){
                        ++ctr;
                    }
                }
            }
        }
        System.out.println(ctr);
    }    
}

/** MY OTHER SOLUTION USING SPLIT.
import java.util.Scanner;
class theCounter { 

static int countThe(String str)
{ 
    str = str.toLowerCase();
    String a[] = str.split(" ");
    int count = 0; 
    for (int i = 0; i < a.length; i++)
    { 
    if ("the".equals(a[i])) 
        count++; 
    } 

    return count; 
} 

public static void main(String args[])
{ 
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter String: ");
    String str = sc.nextLine();

    System.out.print("Number of THE: ");
    System.out.print(countThe(str)); 
} 
}*/