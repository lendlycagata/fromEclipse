package appDeveloper;


public class tapeEuilibrium {	
	public static int solution(int[] A) {
        int total = 0;
        for (int i = 0; i < A.length; i++)
        total += A[i];
        int diff = Integer.MAX_VALUE;
        int prev = 0;
        int next = total;
        for (int p = 1; p < A.length; p++) {
               prev += A[p - 1];
               next = total - prev;
               diff = Math.min(diff, Math.abs(prev - next));
        }
        return diff;
	}		
	
	public static void main(String[] args) {
		int A[]={3,1,2,4,3};
		System.out.println(solution(A));
	}
}


