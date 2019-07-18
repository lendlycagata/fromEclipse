
package forTelus;

 class oopNfs2{
	 
	 public void display(){
	 System.out.println("main display");
	 }
	public void add(int x,int y){
		int z = x + y;
		System.out.println("this is addition" +" " + z );
		
	}
    public void minus(int x,int y){ 
	int z = x - y ;
	System.out.println("this is minus" + " " + z );
	
}


}

 class calculation extends oopNfs2{
	 
	 public void display(){
		 System.out.println("sub display"); 
	 }
	void multiply(int x, int y){
		int z = x * y ;
		System.out.println("this is multiply" + " " +z);
		super.display();
		
	}
	
	public static void main(String[] args) {
		int x = 20 , y=7 ;
		calculation m = new calculation();
		
		m.display();
		m.add(x, y);
		m.minus(x, y);
		m.multiply(x, y);
	}
	
}
