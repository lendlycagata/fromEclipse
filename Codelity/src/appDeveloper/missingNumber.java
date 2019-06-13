package appDeveloper;

import java.util.Arrays;

class missingNumber{
	
	static int missing (int A[]){
		
		int y =0;
		Arrays.sort(A);
		
		for(int i=0; i< A.length ; i++){
			if( y != A[i]){
				y++;
		}
		
		
	}
		return y;
		
	}
	
	public static void main(String[] args) {
		int A[] ={1,2,1,3,4,6};
		System.out.println(missing(A)+ "= is the missing number");
	}
}