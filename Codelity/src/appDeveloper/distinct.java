package appDeveloper;

import java.util.*;

class distinct {
	static int solution (int A[]){
		Set<Integer> numberSet = new HashSet<Integer>();
		for(int number : A){
			numberSet.add(number);
		}
		return numberSet.size();
		
	}
	
	
    public static void main(String[] args) {
    	int A[]={7,1,3,3,1,4,8,4,8,1};
		System.out.println(solution(A));
	}

}
