import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int a[] = new int[n];
		int kol = 0;

		for (int i = 0; i < n; i++) {

			a[i] = scanner.nextInt();
		}

		for (int i = 1; i < n - 1; i++) {

			if ((a[i] > a [i-1]) && (a[i] < a[i+1])) {
				kol++;
			}
		}
		System.out.println(kol);
	}
}