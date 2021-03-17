import java.util.Scanner;
// created by Senpai Aldwin.
public class perfect_matrix {
    public void a1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to generate the matrix: ");
        int col = sc.nextInt();
        sc.close();
        int number = col * col;
        int inc;

        boolean numberPrime;
        if (number % 2 != 0) {
            number = number - (col - 1);
            inc = 1;
            numberPrime = true;
        } else {
            numberPrime = false;
        }
        for (int i = 0; i < col; i++) {
            System.out.println();

            if (numberPrime) {
                if (i % 2 == 0) {
                    inc = 1;
                } else {
                    inc = -1;
                }

            } else {
                if (i % 2 == 0) {
                    inc = -1;
                } else {
                    inc = +1;
                }
            }
            for (int j = 0; j < col; j++) {
                System.out.print(number);
                if (j < (col - 1)) {
                    System.out.print("\t");
                    number = number + inc;
                }
            }
            number = number - col;
        }
    }
}
