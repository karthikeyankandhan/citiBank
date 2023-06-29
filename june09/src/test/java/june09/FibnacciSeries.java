package june09;

import java.util.Iterator;
import java.util.Scanner;

public class FibnacciSeries {
	
	int a = 0;
	
	int b =1;
	
	
	
	
	public void Fib(int N) {
		
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 2; i < N; i++) {
		
			int c= a + b;
			
			
			
			System.out.println(c);
						
			a = b;
			b = c;
			
			
		}

	
		
		
	}
	
	public static void main(String[] args) {
		
		FibnacciSeries feb = new FibnacciSeries();
		
		System.out.println("enter the upto what you want the fiboncii number : ");
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		feb.Fib(N);
		
		
	}

}
