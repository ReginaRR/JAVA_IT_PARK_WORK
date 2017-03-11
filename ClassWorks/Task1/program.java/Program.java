import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 15;
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scanner.nextInt();

	int min = a[0];
	int max = a[0];
	int k = 0,l = 0;
	for ( int i = 0; i < n; i++) {
		if (a[i] < min) {
			min = a[i];
			k = i;

		}
		if (a[i] > max) {
			max = a[i];
			l = i;
		}
	}
	int c = a[k];
	a[k] = a[l];
	a[l] = c;

	for (int i = 0;i < n; i++)
	System.out.println(a[i]);


	}
}