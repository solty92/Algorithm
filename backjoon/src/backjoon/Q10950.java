package backjoon;

import java.util.Scanner;

public class Q10950 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times,a,b;
		times = scanner.nextInt();
		
		for(int i = 0; i<times; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			System.out.println(a+b);
		}
		
	}
}
