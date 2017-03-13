import java.util.Scanner;
class Task7 {
	public static boolean Simple( int a) {
	boolean flag = true;
	    for (int i = 2; i * i < a; i++) {
		   if ( a % i == 0) {

			   flag = false;
			   return flag;
		    }
	    }
	    return flag;
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int x = scanner.nextInt();

    	if (Simple(x) == true)
    		System.out.println ("Number is simple");
    	else
    		System.out.println ("Number is not simple");
    }
}