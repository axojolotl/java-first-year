//package cipher.src;

import java.util.Scanner;

public class encryption {
  
    public static String reverseWord(String word){
        char[] ch=word.toCharArray();  
        String result = "";
        for (int i = ch.length -1; i >= 0; i--) {
            result += ch[i];
        }
        return result;
    }

    public static void printArray(int[] array){
        System.out.println("Encrypted message: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); 
    }

    public static int[] encryptWord(String word, String alphabet, int key){
        //initialize splitted alphabet
        String[] splitAlphabet = alphabet.split("");

        //reverse word and store characters in an array
        word = reverseWord(word);
        String[] splitWord = word.split("");

        //add the ceasar's cipher return encrypted array
        int[] splitCode = new int[splitWord.length];

        for( int i = 0; i < splitWord.length;i++){
            for (int j = 0; j < splitAlphabet.length; j++) {
                if(splitWord[i].equals(splitAlphabet[j]))
                splitCode[i] = j+key;
            }
        }
        return splitCode;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
  
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 0123456789!@#$%^&*()-_+=/.abcdefghijklmnopqrstuvwxyz";
            //2013 2056 2130 > 2130 2056 2013 
        //string to be reversed
        System.out.println("Enter secret message to be encrypted: ");
        String word = sc.nextLine();

        //enter keycode
        System.out.print("Enter keycode: ");
        int key = sc.nextInt();

        //encrypt
        int[] encryptedWord = encryptWord(word,alphabet,key);
        printArray(encryptedWord);
        sc.close();
    }
}
