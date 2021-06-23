package bulk_activities;

import java.util.Scanner;

public class bulkAct7 {

    static Scanner sc = new Scanner(System.in);
    static Scanner scStr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Information count: ");
        int informationCount = sc.nextInt();
        System.out.print("Record count: ");
        int recordCount = sc.nextInt();

        fields(informationCount, recordCount);
    }

    public static void fields(int informationCount, int recordCount){
        String[] informations = new String[informationCount];
        String[][] records = new String[recordCount][informationCount];

        for (int i = 0; i < informationCount; i++) {
            System.out.print("Information #" + i + ": ");
            informations[i] = scStr.nextLine();

        }
        for (int i = 0; i < recordCount ; i++) {
            for (int j = 0; j < informations.length ; j++) {
                System.out.print(informations[j] +"["+i+"]"+": ");
                records[i][j] = scStr.nextLine();
            }
        }
        printDb(records,informations);
    }

    public static void printDb(String[][] records,String[] informations){
        for (String information : informations) {
            System.out.print(information+"\t\t");
        }
        System.out.println();
        for (String[] record : records) {
            for (String s : record) {
                System.out.print(s + "\t\t");
            }
            System.out.println();
        }
    }
}
