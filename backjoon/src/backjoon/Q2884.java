package backjoon;

import java.util.Scanner;

public class Q2884 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		checkMethod(a, b);
	}
	
	public static void checkMethod(int h, int m) {
		if(m - 45 >0) {
			System.out.println(h +" "+(m-45));
		}else if(m - 45 < 0 && h > 0) {
			System.out.println((h-1) + " "+(m+15));
		}else if(m == 45) {
			System.out.println(h +" "+0);
		}else {
			System.out.println(23 + " "+(m+15));
		}
	}
}
