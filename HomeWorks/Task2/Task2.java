import java.util.Scanner;
class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int sum = 0;
		int num = 1;

		while ( a != -1 ) {

			if ( num % 2 == 0) 
				sum += a;

			num++;
			a = scanner.nextInt();
		}

            System.out.println(sum);

		
	}
}