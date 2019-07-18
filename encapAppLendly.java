package forTelus;
import java.util.Scanner;

public class encapAppLendly {
	
	public static void main(String[] args) {
		
		Scanner datareader = new Scanner(System.in);
		
		System.out.println("enter Lendly first role: ");
		String role1 = datareader.nextLine();
		System.out.println("enter Lendly second role: ");
		String role2 = datareader.nextLine();
		System.out.println("enter Lendly third role: ");
		String role3 = datareader.nextLine();
		
		System.out.println("");
		
		encapBookLend x = new encapBookLend();
		x.setRole1(role1);
		x.setRole2(role2);
		x.setRole3(role3);
	
		
		
		System.out.println("these are Lendly role in NFS");
		System.out.println("first role:" + x.getRole1());
		System.out.println("second role: " + x.getRole2());
		System.out.println("third role: " + x.getRole3());
		
	}
	

}
