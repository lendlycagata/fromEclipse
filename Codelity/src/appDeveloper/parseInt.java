package appDeveloper;

public class parseInt {
	static int parse( String S){
			
		int sum = 0 ;
		try{
			String y = S.replaceAll("[^\\d.]","");
			int x = Integer.parseInt(y);
			while ( x > 0){
				sum = sum + x % 10 ;
				x = x /10 ;  
			}
			
			
		}catch(NumberFormatException e){
			System.out.println(e.getMessage());
		}
		
		return sum;
	}
	public static void main(String[] args) {
		String S = "3dfhd5f77hhr6";
		System.out.println(parse(S));
	}
}
