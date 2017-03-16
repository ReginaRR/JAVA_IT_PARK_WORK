import java.util.Scanner;
import java.util.Random;
class Program {
	int n, m;
	public static void Output_Without_Change(int n, int a[][]) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf ("%3d", a[i][j]);
			}
			System.out.printf ("\n");
		}
		System.out.println();

	}
	public static void Change(int n, int arr[][]) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == (n - j - 1))
				   arr[i][j] = 0;
			}
		}


	}
	public static void Output_With_Change(int n, int arr[][]) {
		
		for(int i = 0; i < n; i++) {
			for( int j = 0; j < n; j++) {
				System.out.printf ("%3d", arr[i][j]);	
			}
			System.out.printf ("\n");

		}

	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int x = scanner.nextInt();
		int a[][] = new int[x][x];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				a[i][j] = random.nextInt(99);
			}
		}
		
		Output_Without_Change(x, a);
		Change(x, a);
		Output_With_Change(x, a);
			
    }

}