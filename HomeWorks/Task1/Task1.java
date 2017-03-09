import java.util.Scanner;
class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int p = 1;
		int s = 0;

		while (a != -1) {

			boolean flag = true;


			for (int i = 2; i*i <= a; i++) {

				if (( a % i  == 0) || (a <= 0)) {

					 flag = false;
					 break;
				}
 
			}

			if (flag) {

					 p *= a;
					 s++;

			    }

			    a = scanner.nextInt();
		}

        if ( s != 0)
		    System.out.println(p);
		else
			System.out.println("0");

	}

}