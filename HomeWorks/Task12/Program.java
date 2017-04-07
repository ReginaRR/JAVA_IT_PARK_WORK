import java.util.Scanner;
import java.util.Random;
class Program {
	int n, m;
	public static void Output(int n, int m, int arr[][]) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf ("%3d", a[i][j]);
			}
			System.out.printf ("\n");
		}
		System.out.println();

	}
	
	public static void Sum(int n, int m, int arr[][]) {
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			for( int j = 0; j < m; j++) {
				sum += a[i][j]		
			}
			System.out.println("Sum in "+ (i+1) + "line = " + sum)	;
		}

	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int a[][] = new int[x][x];
		

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				a[i][j] = random.nextInt(99);
			}
		}
		
		Output(x, y, a);
		Sum(x, x, a, array_1);

			
    }

}