package bulk_activities;

import java.util.Scanner;

public class bulkAct4 {
    static Scanner sc = new Scanner(System.in);
    static Scanner scInt = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---Input---");
        System.out.print("Enter max record: ");
        int maxRecord = sc.nextInt();
        record(maxRecord);
    }

    public static void record(int max){
        String[] names = new String[max], genders = new String[max], months = new String[max];
        int[] days = new int[max], years = new int[max];

        for (int i = 0; i < max ; i++) {
            System.out.println("---Rec [" + i + "]---");
            System.out.print("Enter name: ");
            names[i] = sc.next();
            System.out.print("Enter gender: ");
            genders[i] = sc.next();
            System.out.print("Enter month of birth: ");
            months[i] = sc.next();
            System.out.print("Enter day of birth: ");
            days[i] = scInt.nextInt();
            System.out.print("Enter year of birth: ");
            years[i] = scInt.nextInt();
        }
        results(names,genders,months,days,years);
    }

    public static void results(String[] names, String[] genders, String[] months, int[] days, int[] years){
        System.out.println("---Result---");
        System.out.println("NAME\tGENDER\tBIRTH DATE\t\tAGE");
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i] + "\t\t" + genders[i] + "\t" + months[i]+" "+days[i]+", "+ years[i]+"\t\t"+(2020-years[i])+" years old");
        }
    }
}
