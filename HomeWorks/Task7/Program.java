import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int a[][] = new int[n][m];
		num = 0;
		

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scanner.nextInt();

			}
		}

		for (int i = 0; i < n; i++) {
			int sum = 0;
			num++;
			
			for (int j = 0; j < n; j++) {
				sum += a[i][j];
			}
			System.out.println("Sum of"+ num + "line = "+ sum)
		}
		System.out.println(kol);
	}
}