import java.util.Scanner;
import java.util.Random;
class Program {
	int n, m;
	public static void Output_Without_Change(int n, int m, int a[][]) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf ("%3d", a[i][j]);
			}
			System.out.printf ("\n");
		}
		System.out.println();

	}
	public static void Change(int n,int m, int arr[][], int array[][]) {

		for (int i = 0; i < m; i++) {
			int l = 0;
			for (int j = 0; j < n; j++) {
				array[i][j] = arr[l++][n-i-1];
			}
		
		}


	}
	public static void Output_With_Change(int n, int m, int array[][]) {
		
		for(int i = 0; i < n; i++) {
			for( int j = 0; j < m; j++) {
				System.out.printf ("%3d", array[i][j]);	
			}
			System.out.printf ("\n");

		}

	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int x = scanner.nextInt();
		int a[][] = new int[x][x];
		int array_1[][] = new int[x][x];
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				a[i][j] = random.nextInt(99);
			}
		}
		
		Output_Without_Change(x, x, a);
		Change(x, x, a, array_1);
		Output_With_Change(x, x, array_1);
			
    }

}