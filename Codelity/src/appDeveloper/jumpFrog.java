package appDeveloper;

public class jumpFrog {
	static int jump(int s, int j, int end){
		int ctr = 0;
		
		while(s<end){
			s=s+j;
			ctr++;
		}
		
		
		return ctr;
	}
	public static void main(String[] args) {
		int s=10;int j=10;int end=60;
		System.out.println(jump(s,j,end));
	}
	
}
