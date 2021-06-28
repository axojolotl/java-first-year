package bulk_activities;

import java.util.Scanner;

public class bulkAct6 {
    static Scanner sc = new Scanner(System.in);
    static int t = 0;
    static String[][] record = {
            {"AAA", "9", "CS", "1"},
            {"BBB", "10", "IT", "2"},
            {"CCC", "7", "CS", "3"},
            {"DDD", "5", "IT", "4"},
            {"EEE", "3", "Law", "1"},
            {"FFF", "1", "Med", "2"},
            {"GGG", "2", "Eng", "2"},
            {"HHH", "4", "Med", "4"},
            {"III", "6", "Eng", "2"},
            {"JJJ", "8", "Law", "4"} };

    public static void main(String[] args) {
        while (true){
            printRecord();
            System.out.print("Search: ");
            String search = sc.next();
            sort();
            if (search.equalsIgnoreCase("all")) printRecord();
            else printFiltered(search);
        }
    }

    public static void printRecord(){
        System.out.println("NAME\tAGE\t\tCOURSE\tYEAR LEVEL");
        for (String[] strings : record) {
            for (String string : strings) {
                System.out.print(string + "\t\t");
            }
            System.out.println();
        }
        System.out.println("-----END RECORD-----");
    }

    public static void printFiltered(String search){
        System.out.println("NAME\tAGE\t\tCOURSE\tYEAR LEVEL");
        for (String[] strings : record) {
            if (strings[2].toLowerCase().equals(search) || strings[t].equals(search)) {
                for (String string : strings) {
                    System.out.print(string + "\t\t");
                }
                System.out.println();
            }
        }
        System.out.println("-----END RECORD-----");
    }

    public static void sort(){
        System.out.print("Sort Type (AGE/YEAR): ");
        String type = sc.next();
        System.out.print("Sort order (Ascending/Descending): ");
        String order = sc.next();

        System.out.println("-----SORTED BY " + type + ", " + order+ "-----");
        bubbleSort(type, order);
    }


    public static void bubbleSort(String type, String order){
        if (type.equalsIgnoreCase("age")){ t = 1; }
        else if (type.equalsIgnoreCase("year")){ t = 3; }

        String[] temp;
        for(int i = record.length; i > 0; i--){
            for (int j = 0; j < i-1; j++) {
                if (order.equalsIgnoreCase("ascending")) {
                    if (Integer.parseInt(record[j][t]) > Integer.parseInt(record[j + 1][t])) {
                        temp = record[j];
                        record[j] = record[j + 1];
                        record[j + 1] = temp;
                    }
                }
                if (order.equalsIgnoreCase("descending")) {
                    if (Integer.parseInt(record[j][t]) < Integer.parseInt(record[j + 1][t])) {
                        temp = record[j];
                        record[j] = record[j + 1];
                        record[j + 1] = temp;
                    }
                }
            }
        }
    }
}
