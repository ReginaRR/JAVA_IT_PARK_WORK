class Function {
	public static int sum(int a,int b){
	int result = 0;
	for (int i = a; i <=b; i++)
		result += i;
		return result;
	}
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		int c = sum ( x, y);
		System.out.println(c);
	}
}