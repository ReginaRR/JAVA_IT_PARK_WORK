import java.util.Scanner;
class Program { 

     public static void main(String[] args) { 
     	Scanner scanner = new Scanner(System.in);
        int n = 15;
        int [] a = new int[n];
        int p;

        for (int i = 0; i < n; i++) 
        	 a[i] = scanner.nextInt();
        for (int i = 0; i < n/2; i++) {
        	p = a[n-i-1]; 
        	a[n-i-1] = a[i];
        	a[i] = p; 
        }
        for (int i = 0; i < n; i++) 
            System.out.print(a[i]+" ");
        
    }
}


