package appDeveloper;
import java.util.HashSet;

class missingNumber{
	  static int solution(int[] A) {
      HashSet<Integer> seen = new HashSet<Integer>();
      int min = 1;
      for (int i=0;i<A.length;i++) {
      if (A[i] > 0) seen.add(A[i]);
         }
         for(int i = 1 ; i < Integer.MAX_VALUE; i++) {
         if(!seen.contains(i)) return i;
         }
         return min;
  }
public static void main(String[] args) {
	int A[]={1,1,2,2,3,5};
	System.out.println(solution(A));
}
		
}