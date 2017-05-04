import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[][] =  new int[n][n];
	
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = scanner.nextInt();

		int arr[][] = Turn(a, n);
		

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf ("%3d", arr[i][j]);
			}
			System.out.printf ("\n");
		}
	}

	public static int[][] Turn(int a[][], int n){
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++){
			int k = 0;
			
			for (int j = 0; j < n; j++){
				arr[i][j] = a[k][n-i-1];
				k++;
			}
		}
	return arr;
	}
}