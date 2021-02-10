package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inpt = Integer.parseInt(br.readLine());
		
		if(inpt == 0) {
			bw.write("1");
		}else {
			for (int i = inpt-1; i > 1; i--) {
				inpt *= i;
			}
			
			bw.write("" + inpt);
		}
		
		
		bw.close();
		
	}
}