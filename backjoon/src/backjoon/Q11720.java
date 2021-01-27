package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		
		String inpt = br.readLine();
		int sum = 0;
		
		for (int i = 0; i < testCase; i++) {
			sum += inpt.charAt(i)-'0';
		}
		
		bw.write(sum+"");
		
	
	
		bw.flush();
		bw.close();
	}
}