package backjoon;

import java.util.Scanner;

public class Q2588 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		int b1 = b % 10;
		int b2 = (b % 100)/10;
		int b3 = (b % 1000)/100;
		
		System.out.println(a * b1);
		System.out.println(a * b2);
		System.out.println(a * b3);
		System.out.println(a * b);
		
		sc.close();
	}
}
