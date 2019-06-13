package appDeveloper;
class cyclic {
	static int [] cyc (int []A , int K){
		int rotate [] = new int [A.length];
		for(int i = 0 ; i< A.length ; i++){
			int newPost = (i+K) % A.length ; 
			rotate[newPost]=A[i];
		}
		return rotate ; 
	}
	public static void main(String[] args) {
		int A[]= {4,5,6,7,8,9};
		int K = 2 ;
		
		int [] print = cyc(A,K);
		for(int i = 0 ; i< A.length ; i++){
		System.out.print(print[i]);	
		}
	}
}