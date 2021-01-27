package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] array = new int[9]; 
		
		for (int i = 0; i < 9; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		bw.write(max+"\n");
		
		for (int i = 0; i < array.length; i++) {
			if(max == array[i]) {
				bw.write((i+1)+"");
			}
		}
		
		bw.flush();
		bw.close();
	}
}