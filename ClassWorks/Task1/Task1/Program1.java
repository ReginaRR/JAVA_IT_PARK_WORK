import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int a[] = {1,-5,4,6,8,18,20};
		int k = -1;
		for (int i = 0; i < a.length; i++)
			if (a[i] == x)
				k = x;

		System.out.println(k);
		
	}
	
}