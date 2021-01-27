package backjoon;

import java.util.Scanner;

public class Q1065 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int max = scanner.nextInt();
		
		System.out.println(calculator(max));
		
		scanner.close();
	}
	
	public static int calculator(int max) {
		
		int count = 0;
		
		if(max<100) {
			return max;
		}else {
			if(max == 1000) {
				max = 999;
			}
			
			for (int i = 100; i <= max; i++) {
				int first = i % 10;
				int second = (i/10) % 10;
				int third = i / 100;
				
				if((third-second) == (second - first)) {
					++count;
				}
			}count += 99;
		}
		
		
		
		return count;
	}
}