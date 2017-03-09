import java.util.Scanner; 
class Program { 

     public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 
        int n = 15;
        int [] a = new int[n];
        int p = 1;

        for (int i = 0; i < n; i++) 
        	a[i] = scanner.nextInt();
        
        for (int i = 1; i < n; i++) {
            if ( a[i] % 2 == 0) {
                p *= a[i];
                i++;
            }

        }

        System.out.println(p);
    }
}