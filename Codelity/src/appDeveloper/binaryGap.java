package appDeveloper;

class binaryGap{
	static int solution(int N){
		return binary(N,0,0,0);
	}
	
	static int binary(int n,int ctr,int max,int index){
		if(n==0)return max;
		if(n%2==0 && n==0)index =0;
		else if(n%2==0)ctr++;
		else{
			max=Math.max(ctr,max);
			index++;
			ctr=0;
		}		
		
		n=n/2;
		return binary (n,ctr,max,index);
	}
	public static void main(String[] args) {
		int N = 100;
		System.out.println(solution(N));
	}
}