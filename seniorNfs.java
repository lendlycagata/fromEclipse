package forTelus;

public class seniorNfs {
	
	public void status(){
		System.out.println("happy");
	}
	
	public void nfs(){
		System.out.println( "National Field Support");
		
	}

	public void role1(){
		System.out.println("support copper"); 
		
	}
}

  class extra extends seniorNfs {
	  
	  public void status(){
		  System.out.println("not happy");
	  }
	
	 public void role2(){
		 System.out.println("support gpon");
		 
	 }
	 public void role3(){
		 System.out.println("support home security");
		 super.status();
	 }

	 public static void main (String[]args){
		 extra n = new extra();
		 n.status();
		 n.nfs();
		 n.role1();
		 n.role2();
		 n.role3();
		 
	 }
	 
	 
}