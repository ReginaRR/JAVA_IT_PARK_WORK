import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int a[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scanner.nextInt();

			}
		}
		int min[] = Min(a, n, m);
		for(int i = 0; i < m; i++) {
			System.out.println("min in " + (i+1) + " line = " + min[i]);
		}
	}

		public static int[] Min (int a[][], int n, int m) {
			int arr[] = new int[m];
			for (int i = 0; i < n; i++) {
				arr[i] = a[i][0];
				for(int j = 1; j < m; j++) {
				    if(a[i][j] < arr[i]) {
				    	arr[i] = a[i][j];
				    }
			    }
		    }   
		    return arr;
	    }
}
    