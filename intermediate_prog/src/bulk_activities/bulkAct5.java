package bulk_activities;

import java.util.Arrays;
import java.util.Scanner;

public class bulkAct5 {
    private static final Scanner sc = new Scanner(System.in);
    private static final String[][] userData = {
            {"Alucard", "Jan 5, 2000 ", "20", "Male", "Philippines"},
            {"Layla", "Feb 10, 2001", "19", "Female", "Japan"},
            {"Chou", "Mar 15, 2002", "18", "Male", "Europe"},
            {"Miya", "Apr 20, 2010", "19", "Female", "Germany"},
            {"Clint", "May 25, 2012", "8", "Male", "India"},
            {"Eudora", "Jan 30, 2013", "7", "Female", "France"},
            {"Franco", "Nov 11, 2003", "17", "Male", "India"},
            {"Hilda", "Mar 25, 2011", "9", "Female", "Philippines"},
            {"Gord", "Dec 12, 2019", "10", "Male", "Japan"},
            {"Kimmy", "May 23, 2000", "20", "Female", "South Korea"} };

    public static void main(String[] args) {
        startDb();
        searchResults(inputParameters());
    }

    public static void startDb(){
        System.out.println("----------Start DB----------");
        System.out.println("NAME\t\tBIRTH DATE\t\t\tAGE\t\tGENDER\t\tADDRESS");
        for (String[] userDatum : userData) {
            printArray(userDatum);
        }
        System.out.println("----------END DB----------");
    }

    public static String[] inputParameters(){
        String[] parameters = new String[3];
        for (int i = 1; i <= 3; i++) {
            System.out.print("Search parameter " + i + ": ");
            parameters[i-1] = sc.next();
        }
        return parameters;
    }

    public static void searchResults(String[] parameters){
        System.out.println("---Search Result---");
        System.out.println("NAME\t\tBIRTH DATE\t\t\tAGE\t\tGENDER\t\tADDRESS");
        for (String[] userDatum : userData) {
            String temp = String.join("", userDatum);
            if (temp.contains(parameters[0]) && temp.contains(parameters[1]) &&
                    temp.contains(parameters[2])) {
                printArray(userDatum);
            }
        }
        System.out.println("---End Result---");
    }

    public static void printArray(String[] arr){
        for (String s : arr) {
            System.out.print(s + "\t\t");
        }
        System.out.println();
    }
}
