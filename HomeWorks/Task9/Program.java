import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int a[][] = new int[n][m];
		int num = 0;
		

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scanner.nextInt();

			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == j)
				   a[i][j] = 0;
			}
		}

			for(int i = 0; i < n; i++){
				for( int j = 0; j < n; j++) {
					System.out.println(a[i][j]);
					

				}
			}
		
	}
}