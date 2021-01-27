package backjoon;

import java.io.IOException;
import java.util.Scanner;

public class Q1110 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		if(number < 10)
			number *= 10;	
		
		int result = number;	
		int count = 0;
		
		do {
			count++;
			int first = result % 10;	
			int second = (result - first)/10;	
			
			result = first + second;	
			result = result%10 + first*10;	
		}while(number != result);
		System.out.println(count);
		scanner.close();
	}
}