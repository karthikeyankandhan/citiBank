package june09;

public class Palindrome {

	public static void main(String[] args) {

		Palindrome p = new Palindrome();
		p.plaindrome1();
		
		
	}

	
	int n = 0 ; int Rev= 0;
	
	public void plaindrome1()
	{
		
		for (int k = 11; k <40 ; k++) {
			
		
			int j =0; 
	 
	 n=k;
	 System.out.println("value of number passing " +n);
		
			
			while (n>0) {
				
				
				Rev = n % 10;
				System.out.println(Rev);
				
				
				
				j = (j*10)+Rev;
				
				System.out.println(j);
				
				n = n/10;		
				System.out.println(n);
				
								
			}
				if(k ==j) {
				
				System.out.println(" string Reveresed" + j);}
				
				
		
			
		}
			
				 
			
	}
	
}
