package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] array = new int[3]; 
		int number;
		
		for (int i = 0; i < 3; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		number = array[0] * array[1] * array[2];
		
		int[] countArray = new int[10];
		
		while(number > 0) {
			countArray[number % 10]++;
			number /= 10;
		}
		
		for (int i = 0; i < countArray.length; i++) {
			bw.write(countArray[i]+"\n");
		}
		
		
		bw.flush();
		bw.close();
	}
}