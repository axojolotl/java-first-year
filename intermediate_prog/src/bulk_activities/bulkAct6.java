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

    static String[][] filter = new String[record.length][record[0].length];

    public static void main(String[] args) {
        printRecord();
        System.out.print("Search Course: ");
        String course = sc.next();
        sort();
        if (course.toLowerCase().equals("all")) printRecord();
        else printFiltered(course);
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

    public static void printFiltered(String course){
        System.out.println("NAME\tAGE\t\tCOURSE\tYEAR LEVEL");
        for (String[] strings : record) {
            if (strings[2].toLowerCase().equals(course)) {
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
        if (order.toLowerCase().equals("ascending")){
            bubbleSortAscending(type);
        } else if (order.toLowerCase().equals("descending")){
            bubbleSortDescending(type);
        }
    }


    public static void bubbleSortAscending(String type){
        if (type.toLowerCase().equals("age")){ t = 1; }
        else if (type.toLowerCase().equals("year")){ t = 3; }

        String[] temp;
        for(int i = record.length; i > 0; i--){
            for (int j = 0; j < i-1; j++) {
                if(Integer.parseInt(record[j][t]) > Integer.parseInt(record[j+1][t])){
                    temp = record[j];
                    record[j] = record[j+1];
                    record[j+1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDescending(String type){
        if (type.toLowerCase().equals("age")){ t = 1; }
        else if (type.toLowerCase().equals("year")){ t = 3; }

        String[] temp;
        for(int i = record.length; i > 0; i--){
            for (int j = 0; j < i-1; j++) {
                if(Integer.parseInt(record[j][t]) < Integer.parseInt(record[j+1][t])){
                    temp = record[j];
                    record[j] = record[j+1];
                    record[j+1] = temp;
                }
            }
        }
    }

}
