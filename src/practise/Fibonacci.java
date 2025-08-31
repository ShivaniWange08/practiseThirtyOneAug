package practise;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int fir = 0;
		int sec = 1;
		
		System.out.println("fibonacci Series : ");
		for(int i = 1; i<=n; i++) {
			System.out.print(fir+ " ");
			int next = fir + sec;
			fir = sec;
			sec = next;
		}
	}

}
