package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inpt = br.readLine();
		
		String[] array = inpt.split(" ");

		int a = constant(array[0]);
		int b = constant(array[1]);
		
		int result = a > b ? a : b;
		bw.write(result+"");
		
		bw.flush();
		bw.close();
		
	}
	
	public static int constant(String s) {
		String number = "";
		for (int i = 2; i >= 0; i--) {
			number += s.charAt(i);
		}
		
		return Integer.parseInt(number);
	}
}