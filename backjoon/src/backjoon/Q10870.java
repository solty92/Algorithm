package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inpt = Integer.parseInt(br.readLine());
		
		int[] array = new int[inpt+1];
		
		if(inpt < 3) {
			int[] tmpArray = {0, 1, 1};
			bw.write("" + tmpArray[inpt]);
		}else {
			array[0] = 0;
			array[1] = 1;
			
			for (int i = 2; i < array.length; i++) {
				array[i] = array[i-1] + array[i-2];
			}
			
			bw.write("" + array[inpt]);
			
		}
		
		bw.close();
		
	}
}