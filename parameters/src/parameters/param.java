package parameters;

public class param {
	public static int calc(int a, int b) {
		
		return a + b;
	}
	public static void main(String[] args) {

		int result = calc(1,2);
		
		System.out.println(result);
		
		int secondResult = result + calc(1,1);
		System.out.println(secondResult);
	}
}
