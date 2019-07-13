package appDeveloper;

public class permutationCheck {

   static int solution(int A[]){
	   boolean used [] = new boolean[A.length];
	   for (int number : A){
		   if(number < 1 || number > A.length || used[number -1]){
			   return 0;
		   }
		   used[number - 1]=true;
	   }
	   
	   return 1;	   
	   	   
   }

    public static void main(String[] args) {
		int A[]={4,3,1,2};
		System.out.println(solution(A));
	}
	
}
