package forTelus;


class hi extends Thread{
	public void run(){
		
		for(int i=0; i < 5 ; i++){
				System.out.println("hi");
				}		
		try{Thread.sleep(2500);
		}catch(Exception e){}
		
	}
	
}
class hello extends Thread{
	public void run(){
		for(int i=0;i < 5 ; i++){
		System.out.println("hello");
		}
		try{Thread.sleep(2500);
		}catch(Exception e){}
	}
}




public class threadDemo {

	public static void main(String[] args) {
		
		hi object1 = new hi();
		hello object2 = new hello();
		
		object1.start();
		try{Thread.sleep(500);
		}catch(Exception e){}
		object2.start();
	}
	
	
}
