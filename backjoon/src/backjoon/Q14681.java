package backjoon;

import java.util.Scanner;

public class Q14681 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		int result = checkMethod(a, b);
		System.out.println(result);
	}
	
	public static int checkMethod(int x, int y) {
		if(x > 0 && y > 0) {
			return 1;
		}else if(x < 0 && y > 0) {
			return 2;
		}else if(x < 0 && y < 0) {
			return 3;
		}else {
			return 4;
		}
	}
}
