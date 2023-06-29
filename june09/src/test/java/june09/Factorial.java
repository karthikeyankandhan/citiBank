package june09;

public class Factorial {
	
	 int count = 1;
	 
	 public void fac() {
		 for (int i = 5 ; i > 1; i--) {
				
			 count = count * i;
			
				
				
				 System.out.println(count);

						
			}
			
		 
		 System.out.println(count);
		 
	 }

	public static void main(String[] args) {
		Factorial Factorial= new Factorial();
		
		Factorial.fac();
		
	}

}
