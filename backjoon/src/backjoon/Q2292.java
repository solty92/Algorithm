package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inpt = Integer.parseInt(br.readLine());
		
		int division = 1;
		int i = 0;
		while(true) {
			division += 6 * i;
			i++;
			
			if(inpt <= division) {
				bw.write("" + i);
				break;
			}
		}
		
		bw.flush();
		bw.close();
		
	}
	
}