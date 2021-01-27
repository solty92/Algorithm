package backjoon;

import java.util.Scanner;

public class Q8393 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		a = scanner.nextInt();
		int tmp = 0;
		for (int i = 1; i <= a; i++) {
			tmp += i;
		}
		System.out.println(tmp);
		
	}
}
