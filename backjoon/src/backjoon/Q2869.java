package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inpt = br.readLine();
		
		String[] array = inpt.split(" ");
		
		int up = Integer.parseInt(array[0]);
		int down = Integer.parseInt(array[1]);
		int height = Integer.parseInt(array[2]);
		
		if(height == up) {
			bw.write("1");
		}else {
			int result = (int) (Math.ceil(((double)height - up)/(up - down)) + 1);
			bw.write("" + result);
		}
		
		bw.flush();
		bw.close();
		
	}
	
}