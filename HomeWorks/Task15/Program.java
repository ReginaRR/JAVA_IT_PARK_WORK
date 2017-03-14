import java.util.Scanner;
class Program {
   public static int SumOfNumbers(int a) {
	   int sum = 0;
       while (a != 0) {

          sum += a % 10;
	      a /= 10;

        }

	   return sum;

    }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int x = scanner.nextInt();
      System.out.println(SumOfNumbers(x));

   }
}