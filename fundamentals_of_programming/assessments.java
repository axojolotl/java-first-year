import java.util.Scanner;

public class assessments {

	public static void main(String[] args) {
		a11();
	}

	public static void a1() {

		Scanner sc = new Scanner(System.in);

		int i = 1, n = 0, p = 0;

		System.out.print("Enter n: ");
		n = sc.nextInt();
		p = n;
		sc.close();
		while (i <= n) {

			System.out.print(p + " ");
			System.out.print(i + " ");

			p--;
			i++;

		}
	}

	public static void a2() {

		Scanner sc = new Scanner(System.in);

		int n = 0, i = 0, t = 0, o = 1;

		System.out.print("Enter number: ");
		n = sc.nextInt();
		sc.close();
		System.out.print("Odd numbers are: ");
		do {
			t += o;
			System.out.print(o + " ");
			o += 2;
			i++;

		} while (i < n);

		System.out.print("\nThe sum of odd numbers up to " + n + " term is " + t);

	}

	public static void a3() {
		Scanner sc = new Scanner(System.in);

		int n = 0, i = 1, s = 0, c = 0, ts = 0, tc = 0;

		System.out.print("Enter n: ");
		n = sc.nextInt();

		sc.close();

		System.out.println("\nOdd\tSquare\tCube\n");

		while (i <= n) {

			s = i * i;
			c = s * i;
			System.out.print(i + "\t");
			System.out.print(s + "\t");
			System.out.println(c + "\t");
			i += 2;
			ts += s;
			tc += c;
		}
		System.out.println("TOTAL\t" + ts + "\t" + tc);
	}

	public static void a4() {
		Scanner sc = new Scanner(System.in);

		int n, t = 0;

		System.out.print("Enter last number: ");
		n = sc.nextInt();

		sc.close();
		System.out.println(); // just some space
		if (n % 2 != 0) {
			while (n > 0) {
				System.out.print(n + " ");
				t += n;
				n -= 2;
			}
			System.out.println("\nSum is " + t);
		} else {
			System.out.println("That is not an odd number.");
		}

	}

	public static void a5() {
		Scanner sc = new Scanner(System.in);

		int n = 0, i = 0, j = 0, sqc = 0;

		System.out.print("Enter matrix to generate (n by n): ");

		n = sc.nextInt();

		sc.close();
		sqc = n * n;

		while (i < n) {
			while (j < n) {
				System.out.print(sqc + "\t");
			}
			i++;
		}
	}

	public static void a6() {

		Scanner sc = new Scanner(System.in);
		// DecimalFormat df = new DecimalFormat("#,##0.00");
		String uis = " ";
		char uic = ' ';
		double celsius = 0, fahrenheit = 0;

		for (boolean a = true; a;) {

			System.out.println("\nMain Menu");
			System.out.println("a. Celsius to Fahrenheit\nb. Fahrenheit to Celsius\nc. Exit\n");
			System.out.print("Choose option [a, b, or c]: ");
			uis = sc.next().toUpperCase();
			uic = uis.charAt(0);

			sc.close();

			switch (uic) {
				case 'A':
					System.out.print("Celsius - Fahrenheit Conversion\nEnter Celsius: ");
					celsius = sc.nextDouble();
					fahrenheit = celsius * 9 / 5 + 32;
					System.out.println("Fahrenheit equivalent is " + fahrenheit);
					break;

				case 'B':
					System.out.print("Fahrenheit - Celsius\nEnter fahrenheit: ");
					fahrenheit = sc.nextDouble();
					celsius = (fahrenheit - 32) * 5 / 9;
					System.out.println("Celsius equivalent is " + celsius);
					break;
				case 'C':
					System.out.println("End of program. Goodbye");
					a = false;
					break;

				default:
					System.out.println("Invalid entry. ");
					break;
			}
		}
		sc.close();
	}

	public static void a7() {
		int c = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				c += 2;
				System.out.print(c + "\t");
			}
			System.out.println();
		}
	}

	public static void a8() {
		int row, i, k = 5;
		char a = '*';

		for (i = 1; i <= k; i++) {
			for (row = i; row <= k; row++) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

	public static void a9() {
		Scanner input = new Scanner(System.in);

		int c = 1;

		System.out.println("Enter number of rows: ");
		int n = input.nextInt();

		input.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				c += 2;
				System.out.print(c + "\t");
			}
			System.out.println();
		}
	}

	public static void a10() {
		int n = 11, c = 1;

		for (int i = 1; i < n; i++) {

			for (int j = 1; j < n; j++) {
				System.out.print(c + "\t");
				c++;
			}
			System.out.println();
		}
	}

	public static void a11(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int odds = 1, ctr = 0, sum = 0;

		sc.close();
		
		System.out.print("Odd numbers are: ");

		do{
			sum += odds;
			System.out.print(odds + " ");
			odds = odds + 2;
			ctr++;

		}while(ctr < n);
		System.out.println("\nThe sum of odd numbers upto " + n +" term is " + sum);
	}
}
