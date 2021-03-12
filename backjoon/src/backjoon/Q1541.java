package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] array = br.readLine().split("-");

		int plusTotal = 0;
		String[] plusArray = array[0].split("\\+");
		for (int i = 0; i < plusArray.length; i++) {
			plusTotal += Integer.parseInt(plusArray[i]);
		}
		
		int minusTotal = 0;
		for (int i = 1; i < array.length; i++) {
			String[] tmpArray = array[i].split("\\+");
			
			for (int j = 0; j < tmpArray.length; j++) {
				minusTotal += Integer.parseInt(tmpArray[j]);
			}
			
		}
		
		int result = plusTotal - minusTotal;
		bw.write("" + result);
		
		bw.close();
	}

}