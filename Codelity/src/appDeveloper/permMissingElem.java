package appDeveloper;
//find missing element in given permutation

public class permMissingElem {
	public static int solution(int[] A) {
        
        long N = A.length + 1;

        long sum = N * (N + 1) / 2;

        for (int i = 0; i < A.length; i++) sum -= A[i];

        return (int) sum;

 }

	public static void main(String[] args) {
		int A[]={1,2,3,5};
		System.out.println(solution(A));
	}
}
