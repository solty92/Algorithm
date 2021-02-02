package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int kg = Integer.parseInt(br.readLine());
		
		int five = 0;
		int three = 0;
		
		five = kg/5;
		
		boolean success = false;
		
		for (int i = five; i >= 0; i--) {
			if((kg - i*5) % 3 == 0) {
				three = (kg - i*5)/3;
				five = i;
				bw.write(five + three + "");
				success = true;
				break;
			}
		}
		
		if(!success) {
			bw.write("-1");
		}
		
		bw.close();
		
	}
	
}