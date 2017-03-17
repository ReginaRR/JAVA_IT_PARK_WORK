import java.util.Scanner;
class Programjava {
public static int fib(int n) {
	int x = 3;
	int a = 1;
	int b = 1;
	if (n == 1) 
		return 0;

	if (n == 2)
		return 1;
   

		while ( x != n) {
			x++;
			int p = b;
			b = a + b;
			a = p;

		}
		return b;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		int n = scanner.nextInt();
		System.out.println(fib(n));
	}

}
