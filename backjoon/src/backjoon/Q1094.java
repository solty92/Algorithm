package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1094 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int ruler = 64;
		
		int X = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		while(X > 0) {
			
			if(ruler <= X) {
				X -= ruler;
				count++;
			}
			
			ruler /= 2;
			
		}
		
		bw.write(count + "");
		
		bw.close();
	}
}