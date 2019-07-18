package forTelus;

	class overrideDemo {	
			void role(){
				System.out.println("support tech");
			}
			
	 }
	class learning extends overrideDemo{
			void role(){
				System.out.println("receive calibration question");
			}
			
		}
	

	class testOverride{
		public static void main(String[] args) {
			overrideDemo a = new overrideDemo();
			overrideDemo b = new learning();
			System.out.println("Override");
			a.role();
			b.role();
		}	
		
	}