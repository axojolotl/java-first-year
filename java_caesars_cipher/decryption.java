//package cipher.src;

import java.util.Scanner;

public class decryption {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        //initialize characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 123456789!@#$%^&*()-_+=/.abcdefghijklmnopqrstuvwxyz";

        //decrypt
        int[] encryptedWord = inputEncryptedMessage(sc);
        
        String decryptedWord = decryptWord(encryptedWord, alphabet, sc);
        System.out.println("The encrypted message says: \n" + decryptedWord);
    }

    public static String decryptWord(int[] splitCode, String alphabet, Scanner sc){
        
        System.out.print("Enter key: ");
        int key = sc.nextInt();

        String[] splitAlphabet = alphabet.split("");
        //decrypt ceasar cypher return decrypted array
        String decryptedWord = "";
        for (int i = 0; i < splitCode.length; i++) {
            for (int j = 0; j < splitAlphabet.length; j++) {
                if(splitCode[i] == j+key){
                    decryptedWord += splitAlphabet[j];
                }
            }
        }
        decryptedWord = reverseWord(decryptedWord);
          
        return decryptedWord;
    }
    public static int[] inputEncryptedMessage(Scanner sc){
        
        int i = 0;
        int[] encryptedMessage = new int[999];
        System.out.println("Input encrypted message: ");
        System.out.println("**Enter -1 to stop entry**");
        while(i > -1){
            encryptedMessage[i] = sc.nextInt();
            if(encryptedMessage[i] == -1){
                break;
            }
            i++;
        }
        int[] temp = new int[i];
        for (int j = 0; j < temp.length; j++) {
            temp[j] = encryptedMessage[j];
        }
        return temp;
        }

    public static String reverseWord(String word){
        char[] ch=word.toCharArray();  
        String result = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        return result;
    }
    
}
