
class Puzyr {
	public static void main(String[] args) {
		
		int a[] = {1,6,-3,-8,-2,12,11,1};
		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j+1] < a[j]) {
					int k = a[j];
					a[j] = a[j+1];
					a[j+1] = k;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
		   System.out.print(a[i]+" ");
	}
}