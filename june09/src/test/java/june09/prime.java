package june09;

import java.util.Iterator;

public class prime {

	public static void main(String[] args) {
		
		int count1=0;
		int n =0;
		for (int i = 1; i <100; i++) {
			
		//System.out.println(i);
			 n = i; int count =0;
			 
			 for (int j = 2; j < n/2; j++) 
			 {
				 
			//System.out.println(j);
				 
				 
				 if (i%j==0) {
					 
					 				count++;
				 			}
			
			}	
			 
			 if(count ==0) {
				System.out.println("prime number "+i);
				count1++;
			 }	
			
		 
			
		}
		
		System.out.println(count1);

	}

}
