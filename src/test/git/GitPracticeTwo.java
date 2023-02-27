package test.git;

public class GitPracticeTwo {

	public static void main(String[] args) {
		
		System.out.println("result is " + multiply(2, 9));

	}
	
	public static int multiply(int a, int b) {
		int result = a * b;
		return result;
	}
	
	public int test(int x, int y, String message){
		
		System.out.print(message);
		int a = x / y;
		return a;
	}
	

}
