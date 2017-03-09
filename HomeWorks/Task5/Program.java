import java.util.Scanner; 
class Program { 

     public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        int n = 15;
        int [] a = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
        	a[i] = scanner.nextInt();
            sum += a[i];
        }
        

        System.out.println(sum);
    }
}

        	
