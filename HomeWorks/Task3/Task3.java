import java.util.Scanner;
class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		int a = scanner.nextInt(); //only natural numbers
		int P = 1;
		
		while (a != -1) {

			int a1 = a;
			int ost = 0;
			boolean flag = true;

			while ( a1 != 0) {

				ost += a1 % 10;
				a1 = a1 / 10;
			}
		
		    for (int i = 2; i*i <= ost; i++) {

			     if ( ost % i == 0)  {

				     flag = false;
				     break;
			    }
		    }

			if ( flag)
				P *= a;

			a = scanner.nextInt();

		}

		System.out.println(P);
	}
}