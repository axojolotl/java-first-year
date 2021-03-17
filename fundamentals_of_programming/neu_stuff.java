import java.util.Scanner;
import java.text.DecimalFormat;
/*
array_example
array_lab
array_lec
*/
public class neu_stuff{
    public void array_example(){
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$#,##0.00");

        System.out.print("Enter number of employees to process: ");
        int numberOfProcesses = sc.nextInt();

        String[] employeeName = new String[numberOfProcesses];
        double[] hoursWorked = new double[numberOfProcesses],  
        ratePerHour = new double[numberOfProcesses],
        salary = new double[numberOfProcesses];

        System.out.println();
        for(int i = 0; i < numberOfProcesses; i++){
            System.out.print("Enter Employee name: ");
            employeeName[i] = sc.next();

            System.out.print("Enter number of hours worked: ");
            hoursWorked[i] = sc.nextInt();

            System.out.print("Enter rate per hour: ");
            ratePerHour[i] = sc.nextDouble();
            
            salary[i] = hoursWorked[i]*ratePerHour[i];

            System.out.println();
        }
        sc.close();

        System.out.println("Salary Report\n-------------");
        System.out.println("Name\tRate per hour\tHours Worked\tSalary\n");

        for(int j = numberOfProcesses-1; j >= 0;j--){
            System.out.println(employeeName[j]+"\t"+df.format(ratePerHour[j])+"\t\t"+hoursWorked[j]+"\t\t"+df.format(salary[j]));
        }
}
        //=======================ARRAY LAB=============

    public void array_lab() {
        Scanner input = new Scanner(System.in);
        String[] position = { "1st", "2nd", "3rd" };

        int[] arraySizes = InputSize(input, position), 
        a1 = new int[arraySizes[0]], 
        a2 = new int[arraySizes[1]],
        a3 = new int[arraySizes[2]];

        a1 = arrayValues(input, a1, position[0]);
        a2 = arrayValues(input, a2, position[1]);
        a3 = arrayValues(input, a3, position[2]);

        printValues(a1, a2, a3);
        showCommonElements(a1, a2, a3);
    }

    public static int[] InputSize(Scanner sc, String[] position) {
        int[] sizeArray = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter size of the " + position[i] + " array: ");
            sizeArray[i] = sc.nextInt();
        }
        return sizeArray;
    }

    public static int[] arrayValues(Scanner sc, int[] array, String position) {
        System.out.print("Enter value of the " + position + " array: ");

        for (int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();
        return array;
    }

    public static void printValues(int[] a1, int[] a2, int[] a3) {
        System.out.println("\nOutput: ");
        System.out.println("Value of arrays: ");

        System.out.print("Array1: ");
        for (int i = 0; i < a1.length; i++)
            System.out.print(a1[i] + " ");

        System.out.print("\nArray2: ");
        for (int i = 0; i < a2.length; i++)
            System.out.print(a2[i] + " ");

        System.out.print("\nArray3: ");
        for (int i = 0; i < a3.length; i++)
            System.out.print(a3[i] + " ");
    }

    public static void showCommonElements(int[] a1, int[] a2, int[] a3) {
        String commons = "";

        for(int l=0,m=0,n=0 ;l < a1.length && m < a2.length && n < a3.length;) {
            if (a1[l] == a2[m] && a1[l] == a3[n]) {
                commons += a1[l] + " ";
                l++;
                m++;
                n++;
            } 
            else if (a1[l] < a2[m])
                l++;
            else if (a2[m] < a3[n])
                m++;
            else
                n++;
        }
        System.out.print("\nCommon elements in sorted arrays: " + commons);
    }
    //====================================END OF ARRAY LAB=============

    //=====================================ARRAY LECTURE================
    public void array_lec() {
        System.out.println("============SIMULATION 1============");
        simulation_1();
        System.out.println("============SIMULATION 2===========");
        simulation_2();
        System.out.println("============SIMULATION 3===========");
        simulation_3();
        System.out.println("============SIMULATION 4===========");
        simulation_4();
    }

    public static void simulation_1() {
        int[] mysteryNum = new int[25];
        int ctr = 0, i;
        while (ctr < mysteryNum.length) {
            mysteryNum[ctr] = ctr + 1;
            ctr++;
        }
        i = 0;
        do {
            for (int x = 1; x <= 5; x++) {
                System.out.print(mysteryNum[i] + "\t");
                i++;
            }
            System.out.println();
        } while (i < mysteryNum.length);
    }

    public static void simulation_2() {
        int[] number = { 1, 3, 5, 7 };
        int[] numero = { 8, 6, 4, 2 };
        int x, y, value = 0, sum = 0;
        for (x = 0; x < number.length; x++) {
            for (y = 3; y > -1; y--) {
                value = number[x] * numero[y];
                sum += value;
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        System.out.println("sum is " + sum);
    }

    public static void simulation_3() {

        int x;
        int[] one = new int[5];
        int[] two = new int[10];
        for (x = 0; x < one.length; x++) {
            one[x] = 5 * x + 3;
        }
        System.out.print("One contains: ");
        for (x = 0; x < 5; x++) {
            System.out.print(one[x] + " ");
        }
        System.out.println();
        for (x = 0; x < one.length; x++) {
            two[x] = 2 * one[x] - 1;
            two[x + 5] = one[4 - x] + two[x];
        }
        System.out.print("Two contains: ");
        for (x = 0; x < two.length; x++) {
            System.out.print(two[x] + " ");
        }
        System.out.println();
    }

    public static void simulation_4() {

        int count;
        int[] value = new int[5];
        value[0] = 5;
        for (count = 1; count < value.length; count++) {
            value[count] = 5 * count + 10;
            value[count - 1] = value[count] - 4;
        }
        System.out.print("List elements: ");
        for (count = 1; count < value.length; count++) {
            System.out.print(value[count] + " ");
        }
        System.out.println();
    }
    //=========================END OF ARRAY LECTURE================
    
}
