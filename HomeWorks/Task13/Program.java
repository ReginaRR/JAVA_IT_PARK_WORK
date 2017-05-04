import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n= scanner.nextInt();
		int m = scanner.nextInt();
		int a[][] = new int[n][m];
		

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		
		int max[] = Max(a, n, m);
		for(int j = 0; j < n; j++) {
			System.out.println("max in " + (j+1) + " column = " + max[j]);
		}
			
    }
    public static int[] Max (int a[][], int n, int m) {
			int arr[] = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = a[0][j];
				for(int i = 1; i < m; i++) {
				    if(a[i][j] > arr[j]) {
				    	arr[j] = a[i][j];
				    }
			    }
		    }   
		    return arr;
	    }

}