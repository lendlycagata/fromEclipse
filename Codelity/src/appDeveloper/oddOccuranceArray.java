package appDeveloper;

public class oddOccuranceArray {
	static int oddC ( int []A){
		int odd= 0;
		for(int i = 0 ; i < A.length ; i++){
			
			odd = odd ^ A[i];
		}
		
		
		return odd;
	}
		public static void main(String[] args) {
			int []A = {1,2,3,7,1,2,3};
			System.out.println(oddC(A));
		}
}
