package forTelus;

abstract class polyLendly {
	
	String job;
	polyLendly(String job){
		this.job=job;
	}
	abstract String role();
}

	class agent extends polyLendly{
		agent (String job){
			super(job);
		}
		@Override
		String role(){
		return("agent take calls =" + super.job);
		}
	}

	class council extends polyLendly{
		council(String job){
		super(job);
		}
		
		@Override
		String role(){
		return("council attends calibration =" + super.job);
		}
	}
	class programmer extends polyLendly{
		programmer (String job){
		super(job);
		}
		@Override
		String role(){
		return("java programmer =" + super.job);
		}
	}
	
	
	class testPoly{
		
		public static void main(String[] args) {
			polyLendly a = new agent("Jan");
			polyLendly b = new council("Jun");
			polyLendly c = new programmer("Lendly");	
			
			System.out.println(a.role());
			System.out.println(b.role());
			System.out.println(c.role());
			
			System.out.println("need help in queue, we need help");
			
			c = new agent("Lendly");
			System.out.println(c.role() + " to the rescue");
			
			
			
		}
	}
	
	
	
	
	