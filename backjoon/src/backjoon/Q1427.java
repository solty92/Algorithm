package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] inpt = br.readLine().split("");
		
		int[] array = new int[inpt.length];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(inpt[i]);
		}
		
		Arrays.sort(array);
		
		String result = "";
		
		for (int i = array.length-1; i >= 0; i--) {
			result += array[i];
		}
		
		bw.write(result);
		bw.close();
	}
	
}