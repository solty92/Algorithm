package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q5585 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] changeArray = new int[] {500, 100, 50, 10, 5, 1};
		
		int price = Integer.parseInt(br.readLine());
		
		int change = 1000 - price;
		
		int count = 0;
		for (int i = 0; i < changeArray.length; i++) {
			
			if(change >= changeArray[i]) {
				count++;
				change -= changeArray[i];
				i--;
			}
		}
		
		bw.write("" + count);
		
		bw.close();
	}

}