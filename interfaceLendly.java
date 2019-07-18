package forTelus;

interface interfaceLendly {
	void cook();
	void parent();

}
interface officeLendly extends interfaceLendly{
	void agent();
	void council();		
}
interface dreamerLendly extends officeLendly{
	void java_programmer();
	void web_developer();
}

class realLendly implements officeLendly{
	public void cook(){
		System.out.println("Lendly cooks at home");
	}
	
	public void parent(){
		System.out.println("Lendly trying hard to be a good parent");
	}
	public void agent(){
		System.out.println("Jim is a good agent");
	}
	public void council(){
		System.out.println("JIm received calibration question");
	}
	public void java_programmer(){
		System.out.println("oop master");
	}
	public void web_developer(){
		System.out.println("practicing web developing");
	}
	public void dreamer(){
		System.out.println("overthinker");
	}
	
	
	public static void main(String[] args) {
		realLendly z = new realLendly();
		realLendly jim = new realLendly();
		System.out.println("These are Lendly and Jim role in life");
		System.out.println("");
		
		z.cook();
		z.parent();
		jim.agent();
		jim.council();
		z.java_programmer();
		z.web_developer();
		jim.dreamer();
		
		
	}
}
