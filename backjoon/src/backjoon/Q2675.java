package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testCase; i++) {
			String inpt = br.readLine();
			
			String[] array = inpt.split(" ");
			int times = Integer.parseInt(array[0]);
			String word = array[1];
			
			for (int j = 0; j < word.length(); j++) {
				for (int j2 = 0; j2 < times; j2++) {
					bw.write(word.charAt(j));
				}
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		
	}
}