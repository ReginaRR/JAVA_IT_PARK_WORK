import java.util.Scanner;
class Program {

   public static int Average(int n, int m ) {
   	Scanner scanner = new Scanner(System.in); //?input array in different function?
   	   int a[][] = new int[n][m];
   	   int sum = 0;
   	   for (int i = 0; i < n; i++) {
	  	for (int j = 0; j < m; j++) {
	  		a[i][j] = scanner.nextInt();
	  		sum +=a[i][j];
	  	}
	  }

	  return sum / (n * m);
   }


   public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);

	  int x = scanner.nextInt();
	  int y = scanner.nextInt();
	  System.out.println(Average(x, y));
	  
	  }	
}
