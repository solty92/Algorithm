package backjoon;

import java.util.Scanner;

public class Q2753 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		a = scanner.nextInt();
		
		int result = checkMethod(a);
		
		System.out.println(result);
			
	}
	
	public static int checkMethod(int year) {
		if(year % 4 ==0) {
			if(year % 100 != 0 || year % 400 ==0) {
				return 1;
			}
		}
		
		return 0;
	}
}
