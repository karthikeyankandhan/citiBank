package june09;

public class Amstrong {
	
	
	
	
	
	void karthik() {
		
		int count = 0;
		
		for (int k = 1; k <2000; k++)
		{
			 int i =0; int  j =0; 
		
		int R= k;
		
		while (R >0) {
			
			
			i = R%10;
			
		//System.out.println(i);
			
			j = j +(i*i*i);
		//System.out.println(j);
			
			R= R/10;
			
		//	System.out.println(R);
			
					}
		
		if (k==j) {
		
			System.out.println("the given number is amstrong number " + j);
			
			 count ++;
	
					}	
		
		else {
			System.out.println("the given number  is not amstrong number " + k);
		}
		
		System.out.println(count);
	}
		
	
		
	}
		
	

	public static void main(String[] args) {
		
		Amstrong k = new Amstrong();
		
		k.karthik();
		
	}
	
		

}
