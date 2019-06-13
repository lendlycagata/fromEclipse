package appDeveloper;

public class factorialAlter {
	static int factorIteration(int n){
		int result =1;
		for(int i =n; i > 1 ; i--){
			result *=1;
			
		}
			
		return result;
	}
	
	public static void main(String[] args) {
		int n = 9;
		System.out.println(factorIteration(n));
	}
	
}
