package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2576 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int sum = 0;
		int tmp, smallest = 100;
		
		for (int i = 0; i < 7; i++) {
			tmp = Integer.parseInt(br.readLine());
			
			if(tmp % 2 != 0) {
				
				sum += tmp;
				smallest = tmp < smallest ? tmp : smallest;
				
			}
			
		}
		
		if(sum == 0) {
			bw.write("-1");
			bw.close();
			return;
		}
		bw.write(sum + "\n" + smallest);
		
		bw.close();
	}
}