package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String word = br.readLine();
		
		
		for (int i = 0; i < word.length(); i++) {
			word.charAt(i);
			bw.write(word.charAt(i)+"\n");
		}
		
		bw.flush();
		bw.close();
		
	}
}