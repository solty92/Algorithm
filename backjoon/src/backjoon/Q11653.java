package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11653 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int number = Integer.parseInt(br.readLine());
		
		for (int i = 2; i <= number; i++) {
			if(number % i == 0) {
				bw.write(i + "\n");
				number /= i;
				if(number==1) {
					break;
				}
				i--;
			}
		}
		
		bw.close();
		
	}
	
}